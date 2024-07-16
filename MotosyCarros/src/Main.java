import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("por favor ingrese la capacidad máxima del taller");
        int maxEmployees=sc.nextInt();
        String [][][] cube= new String[maxEmployees][2][5];
        int records;
        while(true){
            System.out.println("Ingresa el número de trabajos a registrar");
            records=sc.nextInt();
            if(records<=maxEmployees){
                break;
            }
            System.out.println("no estas ingresando un cantidad adecuada de registros, ten encuenta que la cantidad debe ser menor o igual que la cantidad de trabajadores");
        }


        for(int i=0;i<records;i++){
            System.out.println("ingrece el nombre del empleado :");
            sc.nextLine();
            String emp=sc.nextLine();


            System.out.println("Ingrese el tipo de vehículo(Moto/Carro)");
            cube[i][0][0]=emp;
            // control de error
            String veh=sc.nextLine().toLowerCase();
            if(veh.equals("moto")){
                cube[i][1][0]="moto";
                System.out.println("ingrese la marca");
                String marca=sc.nextLine();
                cube[i][1][1]=marca;
                System.out.println("Ingrese el modelo");
                String modelo=sc.nextLine();
                cube[i][1][2]=modelo;
                System.out.println("Ingrese el año");
                String year=sc.nextLine();
                cube[i][1][3]=year;
                System.out.println("Ingrese el estado: pendiente, reparado o en reparación");
                String estado=sc.nextLine().toLowerCase();
                cube[i][1][4]=estado;
            }
            else{
                cube[i][1][0]="carro";
                System.out.println("ingrese la marca");
                String marca=sc.nextLine().toLowerCase();
                cube[i][1][1]=marca;
                System.out.println("Ingrese el modelo");
                String modelo=sc.nextLine().toLowerCase();
                cube[i][1][2]=modelo;
                System.out.println("Ingrese el año");
                String year=sc.nextLine();
                cube[i][1][3]=year;
                System.out.println("Ingrese el estado: pendiente, reparado o en reparación");
                String estado=sc.nextLine().toLowerCase();
                cube[i][1][4]=estado;
            }

        }



        while(true){
            System.out.println("Introduce el número de lo que deseas hacer:\n1. mostrar la información de la matriz 3D\n2. mostrar la cantidad de vehiculos reparados, en reparacion y pendiente.\n3. buscar la información de un vehiculo en especifico.\n4. actualizar el estado de un vehiculo");
            int text=sc.nextInt();
            if(text==1){

                System.out.println("Agenda de trabajos: ");
                System.out.println("| tipo | Marca | Modelo | Año | Estado |");
                for(int i=0;i<cube.length;i++){
                    for(int l=1;l<cube[i].length;l++){
                        for(int k=0;k<cube[i][l].length;k++){
                            System.out.print(cube[i][l][k]+" ");
                        }
                        System.out.println("");
                    }
                }
            }

            if(text==2){
                int repair=0;
                int repaired=0;
                int pending=0;

                for(int i=0;i<cube.length;i++){
                    for(int l=1;l<cube[i].length;l++){
                        for(int k=4;k<cube[i][l].length;k++){
                            String var=cube[i][l][k].toLowerCase();
                            if(var.equals("reparado")){
                                repaired++;
                            }
                            else if(var.equals("reparar")){
                                repair++;
                            }
                            else{
                                pending++;
                            }
                        }

                    }
                }
                System.out.println("vehiculos reparados: "+repaired);
                System.out.println("Vehiculos en reparación: "+repair);
                System.out.println("Vehiculos pendientes: "+pending);

            }
            if(text==3){

                System.out.println("Introduce la marca que deseas buscar: ");
                sc.nextLine();
                String marca=sc.nextLine().toLowerCase();
                System.out.println("Introduce el modelo que deseas buscar: ");
                String model=sc.nextLine().toLowerCase();

                for(int i=0;i<cube.length;i++){
                    for(int l=1;l<cube[i].length;l++){
                        if(cube[i][l][1].equals(marca) && cube[i][l][2].equals(model)){

                            for(int k=0;k<cube[i][l].length;k++){

                                System.out.print(cube[i][l][k]+" ");
                            }
                            System.out.println("");
                        }
                    }
                }
            }


            if(text==4){
                //actualizar el estado de un vehículo especificado
                System.out.print("Introduce la marca del vehiculo que deseas actualizar: ");
                sc.nextLine();

                String marca=sc.nextLine().toLowerCase();
                System.out.print("Introduce el modelo del vehiculo que deseas actualizar: ");
                String model=sc.nextLine().toLowerCase();
                for(int i=0;i<cube.length;i++){
                    for(int l=1;l<cube[i].length;l++){
                        if(cube[i][l][1].equals(marca) && cube[i][l][2].equals(model)){

                            for(int k=4;k<cube[i][l].length;k++){
                                System.out.println("introduce el nuevo estado: reparado, reparacion,reparado");
                                String newState=sc.nextLine().toLowerCase();
                                cube[i][l][k]=newState;
                            }

                        }
                    }
                }

            }

            System.out.println("¿deseas salir? ingresa si o no, tal cual");
            sc.nextLine();
            String x= sc.nextLine().toLowerCase();
            if(x.equals("si")){
                break;
            }
        }



    }

}