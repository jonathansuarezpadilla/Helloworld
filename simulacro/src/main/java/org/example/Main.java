package org.example;

import org.example.Controllers.AvionController;
import org.example.Controllers.PasajeroController;
import org.example.Controllers.ReservacionController;
import org.example.Controllers.VueloController;
import org.example.Entities.Avion;
import org.example.Entities.Pasajero;
import org.example.Entities.Reservacion;
import org.example.Entities.Vuelo;

import javax.swing.*;
import java.sql.Date;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {



        //reservas


        //creacion
        /*
        ReservacionController reservacionController = new ReservacionController();

        int pasajero=Integer.parseInt(JOptionPane.showInputDialog("inserte el id de pasajero"));
        int vuelo= Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del vuelo "));
        Date fechaReservacion=Date.valueOf(JOptionPane.showInputDialog("ingrece la fecha con el formato yyyy-MM-dd"));
        String asiento=(JOptionPane.showInputDialog("ingrece el numero de su asiento"));

        Reservacion reservacion=new Reservacion(pasajero,vuelo,fechaReservacion,asiento);

        reservacionController.create(reservacion);

        */

        //todas las reservaciones de un vuelo
        //ReservacionController reservacionController = new ReservacionController();
        //int idVuelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de su vuelo"));
        //JOptionPane.showMessageDialog(null, reservacionController.readall(idVuelo));


        //update
        /*
        ReservacionController reservacionController = new ReservacionController();

        int id_reservacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del reservacion"));
        String asiento=JOptionPane.showInputDialog("Ingrese el asiento");

        Reservacion reservacion= new Reservacion();
        reservacion.setAsiento(asiento);
        reservacionController.update(id_reservacion,reservacion);
        */

        /*








        //Vuelo
        VueloController vueloController = new VueloController();

        int id_vuelo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vuelo que desea cambiarle la fecha:"));

        Date fecha_salida= Date.valueOf(JOptionPane.showInputDialog("ingrese la fecha de salida en el siguiente formato: "));


        Vuelo vuelo=new Vuelo();
        vuelo.setFecha_salida(fecha_salida);
        vueloController.update(id_vuelo,vuelo);
        */


        /*
        String destino=(JOptionPane.showInputDialog("Insert to destiny"));
        Date fecha_salida= Date.valueOf(JOptionPane.showInputDialog("ingrese la fecha de salida en el siguiente formato: "));
        Time hora_salida=Time.valueOf(JOptionPane.showInputDialog("Insert the time"));
        int idavion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del avion"));

        Vuelo vuelo=new Vuelo(destino,fecha_salida,hora_salida,idavion);

        vueloController.create(vuelo);
        */

        // buscar por destino de vuelo


        /*
        String destino=(JOptionPane.showInputDialog("Ingrece un id de vuelo"));


        Vuelo vuelo = vueloController.readModel(destino);
        JOptionPane.showMessageDialog(null,vuelo.toString());
        */


        /*
        // pasajeros
        PasajeroController pasajeroController = new PasajeroController();


        String name=(JOptionPane.showInputDialog("Insert to name"));
        String LastName=JOptionPane.showInputDialog("Insert to LastName");
        String Document=(JOptionPane.showInputDialog("Insert to Document"));


        Pasajero pasajero=new Pasajero(name,LastName,Document);
        pasajeroController.create(pasajero);

        //buqueda por nombre

        PasajeroController pasajeroController = new PasajeroController();

        String name=(JOptionPane.showInputDialog("Ingrece un nombre de pasajero"));

        Pasajero pasajero = pasajeroController.readModel(name);
        JOptionPane.showMessageDialog(null,pasajero.toString());


        */



        // aviones
        /*
        AvionController avionController = new AvionController();

        avionController.update(1,"Boeing 747-8",747);
        System.out.println("su datos han sido actualizados");



        JOptionPane.showMessageDialog(null, avionController.readall());
        */

        //ID
        /*
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrece un id de vuelo"));


        Avion avion = avionController.readById(id);
        JOptionPane.showMessageDialog(null,avion.toString());
        */



        /*
        int id=Integer.parseInt(JOptionPane.showInputDialog("Insert to id"));
        String modelo=JOptionPane.showInputDialog("Insert to modelo");
        int capacidad= Integer.parseInt(JOptionPane.showInputDialog("Insert to capacidad"));


        Avion avion=new Avion(id,modelo,capacidad);
        avionController.create(avion);
        */

        //update avion

        AvionController avionController = new AvionController();

        int id=Integer.parseInt(JOptionPane.showInputDialog("Insert el id del avion a actualizar"));
        String modelo=JOptionPane.showInputDialog("Insert to modelo");
        int capacidad= Integer.parseInt(JOptionPane.showInputDialog("Insert to capacidad"));


        Avion avion=new Avion();
        avion.setModelo(modelo);
        avion.setCapacidad(capacidad);
        avionController.update(id,avion);



        //delete avion

        /*
        AvionController avionController = new AvionController();
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del avion"));
        avionController.delete(id);
        */

    }
}