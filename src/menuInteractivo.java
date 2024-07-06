
// agregar un ciclo para hacer control de la cantidad de numeros deseados a ingresar para operar.

import java.util.Scanner;

public class menuInteractivo {
    public static void main(String[] args) {
        System.out.println("opciones a elegir");
        System.out.println("------");
        System.out.println("1. sumar");
        System.out.println("2. multiplicar");
        System.out.println("3. restar");
        System.out.println("4.dividir");
        System.out.println("------");

        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingresa una de las opciones");
        int opcion = sc.nextInt();
        System.out.println("ingrece dos números deseados, teniendo encuenta que el segundo numero no puede ser cero");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        switch(opcion){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 * num2);
                break;
            case 3:
                System.out.println(num1-num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
        }
    }
}
