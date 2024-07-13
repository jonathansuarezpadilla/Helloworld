import java.util.ArrayList;
import java.util.Scanner;

public class buscaPalabras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        System.out.println("ingrece la palabra que desea buscar");
        String word=sc.nextLine().toLowerCase();
        String[] list=sentence.split(" ");
        for (int i = 0; i < list.length; i++) {
            String convert=list[i].toLowerCase();
            if(convert.equals(word)){
                System.out.println("La palabra "+list[i]+" esta en la posición "+(i+1));
                System.out.println("Se encuentra entre la posición "+i+" y "+(i+2));
            }
        }
    }
}
