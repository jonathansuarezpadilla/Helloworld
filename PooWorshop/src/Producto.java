import javax.swing.*;
import java.util.Scanner;

public class Producto {


    private int id;  // identificador de un producto
    private String descripcion; // descripcion de un producto
    private int stock; //
    private String name= "chocolatina";

    public void añadir(int stock) {
        this.stock+=stock;
    }

    public void sacar(int stock) {

        this.stock-=stock;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("El nombre del producto es: "+producto.name);

        System.out.println("quieres ingresa o sacar?\n1. añadir\n2. sacar\n3. motrar stock") ;
        int eleccion=sc.nextInt();
        if(eleccion==1){
            int cantidad1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quieres añadir: "));
            producto.añadir(cantidad1);
            System.out.println("La cantidad de "+producto.name+" es: "+producto.stock);
        }
        else if(eleccion==2){
            int cantidad2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quieres añadir: "));
            if(cantidad2<=producto.stock && cantidad2>=0){
                producto.sacar(cantidad2);
                System.out.println("La cantidad de"+producto.name+"es: "+producto.stock);
            }
            else{
                System.out.println("vas a sacar una cantidad de "+producto.name+" que no puedes");
            }
        }

        else{
            System.out.println("La cantidad de "+producto.name+" es: "+producto.stock);
        }
    }
}
