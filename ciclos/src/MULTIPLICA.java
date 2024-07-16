import java.util.Scanner;

public class MULTIPLICA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingrece el npumero al que desea imprimir la tabla de multiplicar");

        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number*i);
        }
    }
}
