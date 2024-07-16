import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la suceción los n número que quiere obtener de la suceción de fibonacci");
        int n=sc.nextInt();
        // numeros generadores;

        int a=0;
        int b=1;
        int counter=2;

        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(a);
            System.out.println(b);
        }

        else{
            System.out.println(a);
            System.out.println(b);
            while(true){
                int c=a+b;
                System.out.println(c);
                counter++;
                a=b;
                b=c;
                if(counter==n){
                    break;
                }
            }
        }

    }
}
