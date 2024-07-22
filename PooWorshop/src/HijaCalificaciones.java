import javax.swing.*;
import java.util.Scanner;

public class HijaCalificaciones extends Calificaciones{

    double promedio(){
        double resultado=0;
        for(int i = 0; i < listaCalificaciones.size(); i++){
            resultado+=listaCalificaciones.get(i);
        }

        return resultado/listaCalificaciones.size();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HijaCalificaciones cal = new HijaCalificaciones();
        cal.nombre="Jonathan";
        int veces= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de calificaciones que quieres"));
        int count=0;
        while(count<veces){

            System.out.println("Por favor ingresa un calificación");
            double calificacion=sc.nextDouble();
            cal.agregarCalificaciones(calificacion);
            count++;
        }

        System.out.println(cal.nombre+" tu promedio fue de: "+cal.promedio());

    }
}
