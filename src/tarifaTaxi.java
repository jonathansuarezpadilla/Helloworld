import java.util.Scanner;

public class tarifaTaxi {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("por favor añade la distancia recorrida en km");
        double distancia= sc.nextDouble();
        double tarifa=5000;
        System.out.println("la tarifa base es de: "+ tarifa+"$");
        double total= distancia*tarifa;
        System.out.println("El total a pagar es de: "+total);





    }
}
