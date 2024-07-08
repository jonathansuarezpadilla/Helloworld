import java.util.Scanner;

public class horoscopo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "por favor introduzca su dia de nacimiento");
        int day=sc.nextInt();
        System.out.println("por favor introduzca su mes de nacimiento");
        int month=sc.nextInt();

        switch (month) {
            case 1: {
                if (day >= 20 && day <= 31) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("capricornio");
                }
                break;
            }
            case 2: {
                if (day <= 18) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Piscis");
                }
                break;
            }
            case 3: {
                if (day <= 20) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Aries");
                }
                break;
            }
            case 4: {
                if (day <= 19) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Tauro");
                }
                break;
            }
            case 5: {
                if (day <= 20) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Géminis");
                }
                break;
            }
            case 6: {
                if (day <= 20) {
                    System.out.println("Géminis");
                } else {
                    System.out.println("Cáncer");
                }
                break;
            }
            case 7: {
                if (day <= 22) {
                    System.out.println("Cáncer");
                } else {
                    System.out.println("Leo");
                }
                break;
            }
            case 8: {
                if (day <= 22) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
                break;
            }
            case 9:{
                if (day <= 22) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
                break;
            }
            case 10:{
                if(day<=22){
                    System.out.println("Libra");
                }
                else{
                    System.out.println("Escorpio");
                }
                break;
            }
            case 11:{
                if(day<=21){
                    System.out.println("Escorpio");
                }
                else{
                    System.out.println("Sagitario");
                }
                break;
            }

            case 12: {
                if (day<= 21) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Capricornio");
                }
                break;
            }
        }

    }
}
