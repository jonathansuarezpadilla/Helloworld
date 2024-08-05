package org.example.Model;

import org.example.Entities.Avion;
import org.example.Persistence.configDB.MysqlConfig;
import org.example.Persistence.imodel.IAvionModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AvionModelImpl implements IAvionModel {


    //

    @Override
    public Avion create(Avion request){
        Connection connection = MysqlConfig.OpenConnection();

        // lógica de négocio


        // SQL QUERY
        String sqlQuery= "insert into avion(modelo,capacidad) values(?,?);";

        try{
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //setiando los aviones

            preparedStatement.setString(1,request.getModelo());
            preparedStatement.setInt(2,request.getCapacidad());

            //preparedStatement.execute();
            int rowAffectd = preparedStatement.executeUpdate(); // que hace el resultset , fila afecta por la consulta?

            if(rowAffectd==1){
                System.out.println("carga exitosa");
                preparedStatement.close();
                MysqlConfig.closeConnection();
                return request;
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        MysqlConfig.closeConnection();
        return null;
    }


    @Override
    public Avion readById(Integer id){

        Connection connection = MysqlConfig.OpenConnection();

        Avion avion =null;

        try{
            //Create SQL

            String sqlQuery="select * from avion where id_avion=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                avion= new Avion(
                        resultSet.getInt("id_avion"),
                        resultSet.getString("modelo"),
                        resultSet.getInt("capacidad")
                );
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MysqlConfig.closeConnection();
        return avion;
    }


    /*
    @Override
    public ArrayList<Avion> readAll(Integer id){
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

    */

    /*
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

    @Override
    public void delete(Integer id){

        Connection connection=MysqlConfig.OpenConnection();

        try{
            // create SQL
            String sqlQuery="delete from avion where id_avion=?;";
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,id);

            //prepardstatement execute
            preparedStatement.execute();

            preparedStatement.close();
            MysqlConfig.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Integer id, Avion request) {

        Connection connection = MysqlConfig.OpenConnection();

        try{
            String sqlQUery="update avion set modelo=?,capacidad=? where id_avion=?; ";

            PreparedStatement preparedStatement= connection.prepareStatement(sqlQUery);

            preparedStatement.setString(1,request.getModelo());
            preparedStatement.setInt(2,request.getCapacidad());
            preparedStatement.setInt(3,id);


            preparedStatement.execute();

            preparedStatement.close();
            MysqlConfig.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

}
