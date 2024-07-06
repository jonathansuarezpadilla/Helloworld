import java.util.Scanner;

public class conversarUnidades {
    public static void main(String[] args){

        System.out.println("porfavor introduce tu unidad en km");

        Scanner sc=new Scanner(System.in);
        double unidadUno=sc.nextInt();
        double resultado=unidadUno*(1.60934);
        System.out.println(resultado);
    }
}
