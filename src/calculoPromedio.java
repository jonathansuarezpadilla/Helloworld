import java.util.Scanner;

public class calculoPromedio {
    public static void main(String[] args) {
        System.out.println("ingrece 3 calificaciones");


        Scanner sc = new Scanner(System.in);
        double nota1= sc.nextDouble();
        double nota2= sc.nextDouble();
        double nota3= sc.nextDouble();
        double end = (nota1+nota2+nota3)/3;
        if(end>=6){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Reprobado");
        }

    }
}
