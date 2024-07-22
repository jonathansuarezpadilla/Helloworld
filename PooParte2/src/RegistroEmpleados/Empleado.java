package RegistroEmpleados;

public class Empleado extends Persona{

    private int idEmpleado;
    private double salario;

    public Empleado(String name,int edad,int idEmpleado,double salario){
        super(name, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado(){
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }





    public void mostrarInformacionBasica() {

        System.out.println("Hola");

    }


    public int eliminarInformacionBasica() {
        return 1;
    }



}
