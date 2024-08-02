package org.example.Model;

import org.example.Entities.Avion;
import org.example.Entities.Vuelo;
import org.example.Persistence.configDB.MysqlConfig;
import org.example.Persistence.imodel.IVueloModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VueloModelImp  implements IVueloModel {


    @Override
    public Vuelo create(Vuelo request){
        Connection connection= MysqlConfig.OpenConnection();
        try{
           //sql query
            String sqlQuery="insert into Vuelo(destino,fecha_salida,hora_salida,id_avion) values(?,?,?,?);";

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            //setiando los aviones

            preparedStatement.setString(1,request.getDestino());
            preparedStatement.setDate(2,request.getFecha_salida());
            preparedStatement.setTime(3,request.getHora_salida());
            preparedStatement.setInt(4,request.getId_avion());
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
    public Vuelo readById(String destino){
        Connection connection= MysqlConfig.OpenConnection();

        //sql query

        String sqlQuery="select * from Vuelo where destino like ?;";
        Vuelo vuelo=null;

        try{

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"%"+destino+"%");

            preparedStatement.execute(); // ejecuta el query

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                vuelo= new Vuelo(
                        resultSet.getString("destino"),
                        resultSet.getDate("fecha_salida"),
                        resultSet.getTime("hora_salida"),
                        resultSet.getInt("id_avion")
                );
                vuelo.setId_vuelo(resultSet.getInt("id_vuelo"));

                preparedStatement.close();
                MysqlConfig.closeConnection();
                return vuelo;
            }



        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MysqlConfig.closeConnection();
        return vuelo;
    }

    @Override
    public void update(int id, String modelo, int capacidad) {

        Connection connection= MysqlConfig.OpenConnection();
        Vuelo vuelo=null;
        try{
            //Create SQL

            String sqlQuery="select * from  where id_avion=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                vuelo= new Vuelo(
                        resultSet.getString("destino"),
                        resultSet.getDate("fecha_salida"),
                        resultSet.getTime("hora_salida"),
                        resultSet.getInt("id_avion")
                );
                System.out.println("actualización de vuelo realizada");
            }
            else{
                System.out.println("no existe ese vuelo");
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MysqlConfig.closeConnection();
    }
}
