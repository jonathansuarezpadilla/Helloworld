package RegistroEmpleados;

public  class  EmpleadoPermanente extends Empleado{

    public EmpleadoPermanente(String name, int edad, int idEmpleado, double salario) {
        super(name, edad, idEmpleado, salario);
    }



    @Override
    public void mostrarInformacionBasica() {
        System.out.println("**Empleado Permanente:** " + this.getNombre());

    }


    @Override
    public int eliminarInformacionBasica() {
        return this.getIdEmpleado();
    }
}
