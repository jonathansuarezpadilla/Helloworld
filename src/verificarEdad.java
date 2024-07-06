
import java.util.Scanner;

public class verificarEdad {


    public static void main(String[] args){
        System.out.println("por favor ingrece su edad");

        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt(); // leer numeros enteros

        if(age >= 18){
            System.out.println("usted es mayor de edad");
        }
        else{
            System.out.println("usted no es mayor de edad");
        }

        sc.close();

    }


}
