package org.example.Model;

import org.example.Entities.Reservacion;
import org.example.Persistence.configDB.MysqlConfig;
import org.example.Persistence.imodel.IReservacionModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservacionModelImp implements IReservacionModel {


    @Override
    public  Reservacion create(Reservacion request){
        Connection connection= MysqlConfig.OpenConnection();

        //sql Query

        String sqlQuery="insert into reservacion(id_pasajero,id_vuelo,fecha_reservacion,asiento) values(?,?,?,?);";

        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            //set a las reserva

            preparedStatement.setInt(1,request.getId_pasajero());
            preparedStatement.setInt(2,request.getId_vuelo());
            preparedStatement.setDate(3,request.getFecha_reservacion());
            preparedStatement.setString(4,request.getAsiento());

            if(preparedStatement.executeUpdate()==1){
                System.out.println("creación exitosa");
                preparedStatement.close();
                MysqlConfig.closeConnection();
                return request;
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public ArrayList<Reservacion> readAll(Integer id){

        Connection connection= MysqlConfig.OpenConnection();

        ArrayList<Reservacion> reservaciones= new ArrayList<>();


        try{
            //query

            String sqlQuery="select * from reservacion where id_vuelo=?;";
            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,id);
            ResultSet result=preparedStatement.executeQuery();


            while(result.next()){
                Reservacion reservacion=new Reservacion();

                reservacion.setId_pasajero(result.getInt("id_pasajero"));
                reservacion.setId_vuelo(result.getInt("id_vuelo"));
                reservacion.setFecha_reservacion(result.getDate("fecha_reservacion"));
                reservacion.setAsiento(result.getString("asiento"));
                reservacion.setId_reservacion((result.getInt("id_reservacion")));
                reservaciones.add(reservacion);
            }
            preparedStatement.close();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MysqlConfig.closeConnection();
        return reservaciones;
    }




    /*

    @Override
    public ArrayList<Avion> readAll(){
        //open connection
        Connection connection = MysqlConfig.OpenConnection();

        ArrayList<Avion> avions= new ArrayList<>();

        try{
            //create SQL query
            String sqlQuery="select * from avion;";

            //create prepared statement

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);



            // execute query
            preparedStatement.execute();

            // get result

            ResultSet result = preparedStatement.getResultSet();

            while(result.next()){
                Avion avion= new Avion();

                avion.setId_avion((result.getInt("id_avion"))); // Por qué lo trae de esta forma
                avion.setModelo(result.getString("modelo"));
                avion.setCapacidad(result.getInt("capacidad"));
                avions.add(avion);
            }

        }catch(SQLException e){

            throw new RuntimeException(e);
        }

        MysqlConfig.closeConnection();
        return avions;
    }




    @Override
    public void update(int id, String modelo,int capacidad) {

        Connection connection = MysqlConfig.OpenConnection();


        try{
            //create SQL
            String slqQuery="update avion set modelo=?,capacidad=? where id_avion=?;";

            // PreparedStatement

            PreparedStatement preparedStatement= connection.prepareStatement(slqQuery);

            // assing to  ?
            preparedStatement.setInt(3,id);
            preparedStatement.setString(1,modelo);
            preparedStatement.setInt(2,capacidad);
            //ingresar valores de actualización.


            //Execute
            preparedStatement.execute();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


     */
}
