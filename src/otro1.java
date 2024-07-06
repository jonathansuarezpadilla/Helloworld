import java.util.Scanner;
public class otro1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);
        char ke = Character.toLowerCase(caracter);
        if(Character.isLetter(ke)){
            if(ke=='a' || ke=='e' || ke=='i' || ke=='o' || ke=='u'){
                System.out.println("el caracter es una vocal");
            }
            else{
                System.out.println("es una letra");
            }
        }
        else if(Character.isDigit(caracter)){
            System.out.println("el caracter es un digito");
        }
        else if(Character.isWhitespace(caracter)){
            System.out.println("el caracter es un espacio");
        }
        else{
            System.out.println("el caracter es caracter especial");
        }
    }


}
