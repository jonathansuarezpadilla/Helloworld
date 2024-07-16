import java.util.Scanner;

public class HanoiDestin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de discos de la torre: ");
        int numero = teclado.nextInt();

        Hanoi(numero, 1, 2, 3);
    }

    public static void Hanoi(int numero, int origen, int auxiliar, int destino) {

        if (numero== 1) {
            System.out.println("Mover disco de " + origen + " a destino" );
        }
        else {
            Hanoi(numero - 1, origen, destino, auxiliar); // Swap auxiliar and destino
            System.out.println("Mover disco de " + origen + " a " + destino);
            Hanoi(numero - 1, auxiliar, origen, destino); // Swap auxiliar and origen
        }
    }
}
