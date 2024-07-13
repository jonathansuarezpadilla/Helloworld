import java.util.Arrays;
import java.util.Scanner;

public class matrizTranspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("porfavor ingrese un número recuerde que es para una matriz 3*3");
                matriz[i][j]=sc.nextInt();
            }

        }

        int[][] matriz2= new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz2[i][j] = matriz[i][j];
            }
        }

        for(int i=0;i<3;i++){

            for(int j=0;j<i;j++){

                int auxiliar=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=auxiliar ;


            }

        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }


        if(Arrays.deepEquals(matriz2,matriz)){
            System.out.println("Es simetrica");
        }
        else{
            System.out.println("No es simetricca");
        }
    }
}
