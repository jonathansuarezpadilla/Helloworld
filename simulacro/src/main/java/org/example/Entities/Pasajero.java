package org.example.Entities;

public class Pasajero {

    private int id_pasajero;
    private String nombre;
    private String apellido;
    private String documento_indentidad;



    public Pasajero(){

    }

    public Pasajero(String nombre, String apellido, String documento_identidad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.documento_indentidad = documento_identidad;
    }


    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento_indentidad() {
        return documento_indentidad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento_indentidad(String documento_indentidad) {
        this.documento_indentidad = documento_indentidad;
    }



    public String toString(){
        return "id: " + this.id_pasajero + // mira
                ", nombre: " + this.nombre +
                ", apellido: " + this.apellido+
                ", documento_identidad: "+ this.documento_indentidad;
    }
}
