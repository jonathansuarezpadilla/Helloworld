import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ulam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // cantidad de numeros de la secuencia
        int u1 = 1;
        int u2 = 2;
        List<Integer> numbers = new ArrayList<>(); //secuencia de ulam
        numbers.add(u1);
        numbers.add(u2);
        int i = 3;
        // números de secuencia de ulam  deseados
        while (true) {
            int count = 0;
            //verificación si el numero si el número es ulam.

            for (int l = 0; l <= numbers.size() - 1; l++) {
                int number1 = numbers.get(l);
                for (int k = 0; k <= numbers.size() - 2; k++) {
                    int number2 = numbers.get(k);

                    if (number1 != number2 && number2<number1 ) {



                        if (number1 + number2 == i) {
                            count++;
                        }
                    }
                }
            }

            if (count == 1) {
                //agregar a la lista.
                numbers.add(i);
            }
            i++;
            if (numbers.size() == n) {
                break;
            }

        }
        System.out.println(numbers);
    }
}
