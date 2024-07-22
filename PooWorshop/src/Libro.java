import javax.swing.*;
import java.util.Scanner;

public class Libro {
    String titulo="El hombre rebelde";
    String autor="Alber camus";
    Integer AñoPublicacion=1951;
    boolean prestado=false;



    public void actualizar(){
        this.titulo= JOptionPane.showInputDialog("Ingrese el titulo");
        this.autor=JOptionPane.showInputDialog("Ingrese el autor");
        this.AñoPublicacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación"));
        this.prestado=Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el prestado"));
    }
    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(AñoPublicacion);
        System.out.println(prestado);
    }
    public void prestado(){

        this.prestado=true;

    }
    public  void devolver(){
        this.prestado=false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        while(true){
            System.out.println("Porfavor introduzca el némero de lo que desea hacer");
            System.out.println("1. actualizar datos del libro\n2. mostrar datos del libro\n3. prestar\n4. devolver");
            int entrada=sc.nextInt();
            if(entrada==1){
                libro.actualizar();
            }
            else if (entrada==2) {
                libro.mostrar();
            }
            else if(entrada==3){
                libro.prestado();
            }
            else if(entrada==4){
                libro.devolver();
            }

            System.out.println("¿Deseas salir o continuar? introduce (S/N)");

            String opcion=sc.next().toUpperCase();
            if(opcion.equals("S")){
                break;
            }
        }
    }


}
