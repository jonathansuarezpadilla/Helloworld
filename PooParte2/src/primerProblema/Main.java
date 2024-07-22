package primerProblema;

import javax.swing.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ingresaremos productos a una lista");

        //sobre carga de constructores para una clase.
        Inventario pr1=new Inventario();

        while(true){

            System.out.println("Ingresa el número de lo que deseas hacer:\n\n1. añadir producto\n2. eliminar producto\n3. Listar productos\n4. buscar producto");
            int opcion = sc.nextInt();
            if(opcion==1){
                String nombre= JOptionPane.showInputDialog("Ingresa el nombre del producto");
                int id= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del producto"));
                double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrece el precio del producto"));
                String marca=JOptionPane.showInputDialog("Ingresa la marca");
                String categoria=JOptionPane.showInputDialog("Ingresa la categoria");

                // informacion basica del producto:
                ProductoEspecifico pr= new ProductoEspecifico(nombre,id,precio,marca,categoria);

                // información de marca y categoria:
                pr1.agregar(pr);
            }

            else if(opcion==2){
                String removerProducto=sc.next();
                pr1.remover(removerProducto);

            }

            else if(opcion==3){
                pr1.listar();
            }


            else{
                System.out.println("Introduzca el producto que desea buscar");
                String palabra= sc.next();
                pr1.buscar(palabra);
            }


            System.out.println("¿Quieres salir? Ingresa (S/N)");
            String opcion1=sc.next().toLowerCase();
            if(opcion1.equals("s")){
                break;
            }


        }
    }


}