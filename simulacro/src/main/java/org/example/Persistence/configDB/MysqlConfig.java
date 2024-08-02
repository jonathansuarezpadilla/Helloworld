package org.example.Persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {


    private static Connection connection=null;

    public static Connection OpenConnection() {

        String URL="jdbc:mysql://localhost:3306/simulacro";
        String user="root";
        String password="";

        try{
            connection=DriverManager.getConnection(URL,user,password); // que hace aquí?
            System.out.println("Connection succesful");
        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }

        return connection;
    }

    public static void closeConnection(){
        if(connection!=null){

            try{
              connection.close();
                System.out.println("Connection closed");
            }catch(SQLException e){
                throw new RuntimeException(e.getMessage()); // mirar tipos de erroresz
            }
        }
    }


}
