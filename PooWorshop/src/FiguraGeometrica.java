import javax.swing.*;
import java.util.Scanner;

public  class FiguraGeometrica {

    Double area;

    //polimorfismo:

    public double calcularArea(double lado, int numeroLados){
        area=(numeroLados*Math.pow(lado,2))/(4*Math.tan(Math.PI/numeroLados));
        return area;
    }

    public double calcularArea(double radio){
        area=Math.PI*(Math.pow(radio,2));
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiguraGeometrica fg = new FiguraGeometrica();
        System.out.println("introduce el numero de la figura a la que le quieres cálcular el área:\n1. circulo\n2. polígono regular");
        int opcion=sc.nextInt();
        if(opcion==2){

            Double lado=Double.parseDouble(JOptionPane.showInputDialog("introduce la longitud del lado"));
            int numeroLado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de lados del poligono"));
            System.out.println("El área del polígono "+fg.calcularArea(lado,numeroLado));
        }
        else{
            Double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
            System.out.println("El area del circulo sera "+fg.calcularArea(radio));
        }
    }
}
