import java.util.Scanner;

public class calculadoraPropina {

    public static void main(String[] args) {
        System.out.println("ingrese el valor total de la cuenta:");
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        System.out.println("ingrese el porcentaje de propina");
        double propina = sc.nextDouble();

        double resultado = (total/100)*propina;
        System.out.println("el dinero que debe dejar es: " + resultado);
    }
}
