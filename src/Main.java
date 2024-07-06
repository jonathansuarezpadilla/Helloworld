
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Ingrese su edad");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        System.out.println("Ingrese un Nombre");
        sc.nextLine();
        String textInput=sc.nextLine();
        sc.close();


        switch(age){
            case 12:
                System.out.println("el numero es 12");
                break;
            case 13:
                System.out.println("el numero es 13");
                break;
            default:
                System.out.println("a lo mejor ya esta muy viejo");
        }
    }
}