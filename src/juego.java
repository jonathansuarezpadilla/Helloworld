import java.util.Scanner;

public class juego {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("elije una opcion");

        System.out.println("---");
        System.out.println("1. piedra");
        System.out.println("2. papel");
        System.out.println("3. tijera");
        System.out.println("---");

        int opcion = sc.nextInt();
        int suerte=(int) (Math.random()*3)+1;
        System.out.println(suerte);

        if(opcion==suerte){
            System.out.println("empate");
        }
        if(opcion==1 && suerte==2){
            System.out.println("papel");
        }
        else if(opcion==1 && suerte==3){
            System.out.println("ganaste");
        }

        if(opcion==2 && suerte==3){
            System.out.println("perdiste");
        }
        else if(opcion==2 && suerte==1){
            System.out.println("ganaste");
        }
        if(opcion==3 && suerte==1){
            System.out.println("perdiste");
        }
        else if(opcion==3 && suerte==2){
            System.out.println("ganaste");
        }

    }
}
