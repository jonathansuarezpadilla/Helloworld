import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        System.out.println("ingrece su peso en kilogramos");
        Scanner sc = new Scanner(System.in);
        double peso= sc.nextInt();
        System.out.println("ingrese su altura en metros");
        double altura= sc.nextInt();
        double imc = peso/(altura*altura);
        System.out.println(imc);
    }
}
