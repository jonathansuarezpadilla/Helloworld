import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------");
        System.out.println("introduzca la operación que desea hacer,es decir, multiplicar...");
        System.out.println("1. multiplicar");
        System.out.println("2. dividir");
        System.out.println("3. restar");
        System.out.println("4. sumar");
        System.out.println("-------");
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine().toLowerCase();

        System.out.println("por favor ingrece dos números, siendo el segundo diferente de cero si su operación es dividir");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        String[] list= {"multiplicar","dividir","restar","sumar"};

        for(String operate:list){

            if(operate.equals(word)) {
                switch (operate) {
                    case "multiplicar": {
                        int result = num1 * num2;
                        System.out.println("su resultado es: " + result);
                    }
                    break;
                    case "dividir": {
                        int result1 = num1 / num2;
                        System.out.println("Su resultado es: " + result1);
                    }
                    break;
                    case "restar": {
                        int result2 = num1 - num2;
                        System.out.println("Su resultado es: " + result2);
                    }
                    case "sumar": {
                        int result3 = num1 + num2;
                        System.out.println("Su resultado es: " + result3);
                    }
                }
            }

        }
    }
}