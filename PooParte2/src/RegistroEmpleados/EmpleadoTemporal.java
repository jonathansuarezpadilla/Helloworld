package RegistroEmpleados;

public class EmpleadoTemporal extends Empleado{


    public EmpleadoTemporal(String name, int edad, int idEmpleado, double salario) {
        super(name, edad, idEmpleado, salario);

    }





    @Override
    public void  mostrarInformacionBasica() {
        System.out.println("**Empleado Temporal:** " + this.getNombre());

    }

    @Override
    public int eliminarInformacionBasica() {
        return this.getIdEmpleado();
    }

}
