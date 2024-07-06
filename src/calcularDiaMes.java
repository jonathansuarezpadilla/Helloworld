import java.util.Scanner;

public class calcularDiaMes {
    public static void main(String[] args){
        System.out.println("por favor introduzca un numero de mes que se encuentre en el rango de 1 a 12");
        Scanner sc = new Scanner(System.in);
        int day= sc.nextInt();

        switch(day){
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
        }
        sc.close();
    }
}
