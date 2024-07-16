import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("porfavor ingrese el un número al cual se le calculara el factorial");
        int n=sc.nextInt();

        if(n==0){
            System.out.println(1);
        }
        else{

            int acumulador=1;
            for(int i=1;i<=n;i++){
                acumulador*=i;
            }

            System.out.println(acumulador);
        }

    }


}
