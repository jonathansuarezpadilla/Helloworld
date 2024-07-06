import java.util.Scanner;

public class conversior_De_Temperatura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----");
        System.out.println("elija la temperatura que desea conventir"+"\n"+"1. Celcius"+"\n"+"2. Fahrenheit");
        System.out.println("-----");
        int opcion=sc.nextInt();
        System.out.println("introduzca su temperatura");
        double temperatura= sc.nextInt();
        switch (opcion){
            case 2:
                double Celcius= (temperatura-32)*(5/9);
                System.out.println("su temperatura de farenheit a celcius es: "+Celcius);
                break;
            case 1:

                double Fahrenheit=(temperatura*9/5)+(32);
                System.out.println("su temperatura de celcius a farenheit es: "+Fahrenheit);
                break;

        }


    }
}
