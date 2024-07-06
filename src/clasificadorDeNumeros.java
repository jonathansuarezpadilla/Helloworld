import java.util.Scanner;

public class clasificadorDeNumeros {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("por favor ingrece un numero");
        int numero= entrada.nextInt();
        if(numero>0){
            System.out.println("el numero es positivo");
        } else if (numero==0) {
            System.out.println("el numero es cero");
        }
        else{
            System.out.println("el numero es negativo");
        }

        if(numero%2==0){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
        entrada.close();
    }
}
