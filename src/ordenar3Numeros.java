import java.util.Scanner;

public class ordenar3Numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
        if(a>b && a>c){
            if(b>c){
                System.out.printf(c+" "+b+" "+a);
            }
            else{
                System.out.println(b+" "+c+" "+a);
            }
        }

        if(b>a && b>c){
            if(a>c){
                System.out.println(c+" "+a+" "+b);
            }
            else{
                System.out.println(a+" "+c+" "+b);
            }

        }
        if(c>a && c>b){
            if(a>b){
                System.out.printf(b+" "+a+" "+c);
            }
            else{
                System.out.println(a+" "+b+" "+c);
            }
        }
        if(a==c && a==b){
            System.out.println("todos son iguales");
            System.out.println(a+" "+" "+b+" "+c);
        }
       */



       boolean verdad= a>b && a>c;
       boolean verdad1 = b>a && b>c;
       boolean verdad2 = c>a && c>b;

       String resultado = a>b && a>c ?  (b>c ?  c+" "+b+" "+a: b+" "+c+" "+a): "nada";
       String resultado1 = b>a && b>c ?  (a>c ? c+" "+a+" "+b: a+" "+c+" "+b) : "nada";
       String resultado2 = c>a && c>b ? a>b ? b+" "+a+" "+c: a+" "+b+" "+c : "nada";

      String final1= verdad? resultado:(verdad1? resultado1:verdad2? resultado2:"son iguales");

        System.out.println(final1);


    }
}
