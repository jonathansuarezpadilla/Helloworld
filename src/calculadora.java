

/*
Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar, multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y los resultados.

*/


import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        System.out.println("por favor ingrese dos números");

        // crear una instancia

        Scanner sc = new Scanner(System.in);


        // pedir números
        int numberOne=sc.nextInt();
        int numberTwo=sc.nextInt();

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne*numberTwo);
        System.out.println(numberOne/numberTwo);
        System.out.println(numberOne-numberTwo);
        sc.close();
    }

}
