import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        System.out.println("introduce la cantidad de notas que tienes, ten encuentas que la cantidad maxima es de 8");
        Scanner sc = new Scanner(System.in);
        int notas=sc.nextInt();
        int lista[]=new int[8];
        for(int i=0;i<notas;i++){
            System.out.println("por favor introduzca una nota");
            int nota=sc.nextInt();
            lista[i]=nota;
        }
        double sumaNotas=0;
        for(int i=0;i<notas;i++){
            sumaNotas+=lista[i]*(12.5/100);

        }

        double puntajeMinimo=76-sumaNotas;
        if(puntajeMinimo<=0){
            System.out.println("no necitas es forzarte ¡a dormir!");
        }
        else{
            if(8-notas==0){
                System.out.println("ya perdiste");
            }
            else{
                double resultado=((76-sumaNotas)/(8-notas))*(100/12.5);
                if(resultado>100){
                    System.out.println("Malas noticias, ya la materia esta perdida");
                }
                else{
                    System.out.println("necesitas sacar para cada nota: "+resultado);
                }
            }

        }


    }
}
