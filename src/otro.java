import java.util.Scanner;

public class otro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char otravez= sc.next().charAt(2);
        char letra='*'; // un asterisco especial no es una letra
        System.out.println(Character.isLetter(letra));
        System.out.println(Character.isLetter(otravez));

    }
}
