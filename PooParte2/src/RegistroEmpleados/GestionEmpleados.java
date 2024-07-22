package RegistroEmpleados;

import java.util.ArrayList;

public class GestionEmpleados {

    ArrayList<Empleado> empleados=new ArrayList();


    // Método para agregar la información
    public void agregar(Empleado emp){
        this.empleados.add(emp);
    }

    //Método para eliminar la información
    public void eliminar(int idEmpleado){
        for(int i=0; i<this.empleados.size();i++){
            if(this.empleados.get(i).eliminarInformacionBasica()==idEmpleado){
                this.empleados.remove(i);
                break;
            }
        }
    }


    //Método para mostrar la información
    public void mostrarEmpleados(){
        for(Empleado e:this.empleados){
            e.mostrarInformacionBasica();
        }
    }


}
