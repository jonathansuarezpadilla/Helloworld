package org.example.Entities;

import java.sql.Date;
import java.time.LocalDate;

public class Reservacion {

    private int id_reservacion;
    private int id_pasajero; //foranea
    private int id_vuelo;  //foranea
    private Date fecha_reservacion;
    private String asiento;


    public Reservacion(){

    }

    public Reservacion( int id_pasajero, int id_vuelo, Date fecha_reservacion, String asiento) {
        this.id_pasajero = id_pasajero;
        this.id_vuelo = id_vuelo;
        this.fecha_reservacion = fecha_reservacion;
        this.asiento = asiento;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public Date getFecha_reservacion() {
        return fecha_reservacion;
    }

    public void setFecha_reservacion(Date fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString(){
        return "id: " + this.id_reservacion +
                ", id_pasajero: " + this.id_pasajero +
                ", id_vuelo: " + this.id_vuelo+
                ", fecha_reservacion: "+ this.fecha_reservacion+
                ", asiento: " +this.asiento;
    }
}