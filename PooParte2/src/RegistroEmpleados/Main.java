package RegistroEmpleados;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         GestionEmpleados ges = new GestionEmpleados();

         while(true){
            String TipoEmpleado= JOptionPane.showInputDialog("Ingrese el tipo Empleado que desea agregar:(Temporal o Permanente)").toLowerCase();


            if(TipoEmpleado.equals("temporal")){


                System.out.println("Ingresa una opción:\n1. añadir un empleado\n2. eliminar un empleado\n3. mostrar los empleado de la lista");
                int variable= sc.nextInt();


                if(variable==1){
                    String name= JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del empleado"));
                    int idEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado"));
                    double salario= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
                    EmpleadoTemporal eTemporal= new EmpleadoTemporal(name,edad,idEmpleado,salario);
                    ges.agregar(eTemporal);
                }
                else if(variable==2){
                    System.out.println("Introduce el id del empleado que desea eliminar");
                    int id=sc.nextInt();
                    ges.eliminar(id);
                }
                else{
                    ges.mostrarEmpleados();
                }
            }
            else{

                System.out.println("Ingresa una opción:\n1. añadir un empleado\n2. eliminar un empleado\n3. mostrar los empleado de la lista");
                int variable= sc.nextInt();

                if(variable==1){
                    String name= JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
                    int idEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado"));
                    double salario= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
                    Empleado ePermanente= new EmpleadoPermanente(name,edad,idEmpleado,salario);
                    ges.agregar(ePermanente);
                }
                else if(variable==2){
                    System.out.println("Introduce el id del empleado que desea eliminar");
                    int id=sc.nextInt();
                    ges.eliminar(id);
                }
                else{
                    ges.mostrarEmpleados();
                }


                System.out.println("Desea salir? (S/N)");
                String x=sc.next().toLowerCase();

                if(x.equals("s")){
                    break;
                }


            }

        }
     }
}
