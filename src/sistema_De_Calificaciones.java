import java.util.Scanner;

public class sistema_De_Calificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        double calificacion =Math.round(sc.nextDouble()) ;

        if(100>=calificacion && calificacion>=90){
            System.out.println("su califiación es: A ¡felicitaciones!");
        }
        if(89>=calificacion && calificacion>=80){
            System.out.println("Su califiacion es: B, lo hiciste bien");
        }
        if(79>=calificacion && calificacion>=70){
            System.out.println("Su califiacion es: C, puedes hacer lo mejor :)");
        }
        if(69>=calificacion && calificacion>=50){
            System.out.println("Su calificación es: D, vuelve a intentarlo campeon");
        }
        if(49>=calificacion && calificacion>=0){
            System.out.printf("Su calificacion es: F, debes estudiar campeón");
        }



    }
}
