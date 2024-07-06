import java.util.Scanner;

public class calculadoraBisiesto {

    public static void main(String[] args) {
        System.out.println("por favor introduce el año");
        Scanner sc = new Scanner(System.in);
        int bisiesto=sc.nextInt();
        if(bisiesto%4==0){

            if(bisiesto%100==0 && bisiesto%400==0){
                System.out.println("es bisiesto");
            }

            else{
                System.out.println("no es bisiesto");
            }

        }
        else{
            System.out.println("no es bisiesto");
        }
    }

}
