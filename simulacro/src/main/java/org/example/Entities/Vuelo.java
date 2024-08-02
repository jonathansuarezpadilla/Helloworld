package org.example.Entities;

import java.sql.Time;
import java.sql.Date;


public class Vuelo {


    private int id_vuelo;
    private String destino;
    private Date fecha_salida;
    private Time hora_salida;
    private int id_avion;

    public Vuelo(){

    }


    public Vuelo(String destino, Date fecha_salida, Time hora_salida,int id_avion) {
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.id_avion = id_avion;
    }





    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_salida() {
        return this.fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }


    public String toString(){
        return "id: " + this.id_vuelo +
                ", destino: " + this.destino +
                ", fecha_salida: " + this.fecha_salida+
                ", hora_salida: "+ this.hora_salida+
                ", id_avion: " +this.hora_salida;
    }
}
