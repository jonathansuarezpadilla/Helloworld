import java.util.Scanner;

public class rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor introduce la altura que quieres desde la esquina del rombo a su centro" +
                "");
        int lado = sc.nextInt();


        int espacio=lado-1;
        int asterisco=1;

        // cuenta altura
        for (int i=1; i<=lado; i++){
            StringBuilder cadena=new StringBuilder();

            // concatena # de asterisco
            cadena.append(" ".repeat(espacio)+"*".repeat(asterisco));

            asterisco+=2;
            espacio-=1;

            System.out.println(cadena.toString());


        }
        asterisco-=2;
        espacio+=1;
        for(int l=asterisco;l>1; l-=2){
            espacio+=1;
            asterisco-=2;
            StringBuilder cadena2=new StringBuilder();
            cadena2.append(" ".repeat(espacio)+"*".repeat(asterisco));
            System.out.println(cadena2.toString());
        }

    }
}
