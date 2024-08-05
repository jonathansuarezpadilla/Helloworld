package org.example.Model;

import org.example.Entities.Pasajero;
import org.example.Persistence.configDB.MysqlConfig;
import org.example.Persistence.imodel.IPasajeroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasajeroModelImpl implements IPasajeroModel {

    @Override
    public Pasajero create(Pasajero request){


        // connection

        Connection connection = MysqlConfig.OpenConnection();


        //sql

        String slqQuery= "insert into pasajero(nombre,apellido,documento_identidad) values(?,?,?);";



        try{

            //PreparenStatement
            PreparedStatement preparedStatement = connection.prepareStatement(slqQuery);


            preparedStatement.setString(1,request.getNombre());
            preparedStatement.setString(2,request.getApellido());
            preparedStatement.setString(3,request.getDocumento_indentidad());

            int rowEffect= preparedStatement.executeUpdate(); // #número de filas afectadas

            if(rowEffect==1){
                System.out.println("Carga exitosa");
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

    public Pasajero readById(String name){
        Connection connection = MysqlConfig.OpenConnection();
        Pasajero pasajero = null;
        try{
            //query
            String sqlQuery= "select * from pasajero where nombre like ?;";

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"%"+name+"%");

            preparedStatement.execute(); // ejecuta el query

            ResultSet resultSet= preparedStatement.getResultSet();
            if(resultSet.next()){
                pasajero = new Pasajero(
                        resultSet.getString("nombre"),
                        resultSet.getString("apellido"),
                        resultSet.getString("documento_identidad")
                );
                pasajero.setId_pasajero(resultSet.getInt("id_pasajero"));
                preparedStatement.close();
                MysqlConfig.closeConnection();
                return pasajero;
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        MysqlConfig.closeConnection();
        return pasajero;
    }

    @Override
    public void update(Integer id, Pasajero request){

        Connection connection = MysqlConfig.OpenConnection();

        try{
            String sqlQuery="update pasajero set nombre=?, apellido=?,documento_identidad=? where id_pasajero=?;";
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(4,id);
            preparedStatement.setString(1,request.getNombre());
            preparedStatement.setString(2,request.getApellido());
            preparedStatement.setString(3,request.getDocumento_indentidad());
            preparedStatement.execute();

            preparedStatement.close();
            MysqlConfig.closeConnection();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

}
