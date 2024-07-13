import java.util.Scanner;

public class transponerMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matriz={{1,2,3},{4,5,6},{7,8,9}};

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



    }


    /*

    1 2 3
    4 5 6
    7 8 9

    i-> fila
    j-> columna

    i=1 ,1 2 3;     j
    j=1 , 1
    j2=2, 2
          3

     */


}
