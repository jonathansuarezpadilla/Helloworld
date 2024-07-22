import javax.swing.*;
import java.util.Scanner;

public class GestionEmpleo {

    Scanner sc= new Scanner(System.in);
    String name;
    String posicion;
    double salario;
    int id;

    public void modificar(){
        this.name = JOptionPane.showInputDialog("Ingrese el nombre del empleado");;
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingresa tu salario"));
        this.id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado"));
        this.posicion =JOptionPane.showInputDialog("Ingrese el posicion del empleado");;
    }


    public void mostrar(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(posicion);
        System.out.println(salario);
    }

    public void aumento(){
        double porcentaje= sc.nextInt();
        this.salario=salario+((salario/100)*porcentaje);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GestionEmpleo obj= new GestionEmpleo();
        System.out.println("Por favor ingrese la información del empleado pedida acontinuación: ");
        obj.modificar();
        while(true){
            System.out.println("Seleccione un numero según lo que desea hacer: ");
            System.out.println("1. modificar información del empleado\n2. Mostrar la información del empleado\n3. aumenta el salario del empleado segpu el porcentaje deseado");
            int entrada= sc.nextInt();
            if(entrada==1){
                obj.modificar();
            }
            if(entrada==2){
                obj.mostrar();
            }
            if(entrada==3){
                obj.aumento();
            }

            System.out.println("¿Deseas salir o continuar? introduce (S/N)");
            String opcion=sc.next().toUpperCase();
            if(opcion.equals("S")){
                break;
            }
        }
    }
}
