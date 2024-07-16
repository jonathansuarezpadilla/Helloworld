import java.util.Scanner;
// buscando una palabra en un texto y contar cuantas veces esta.
public class indexOFRepetidos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cont=0;
        System.out.println("por favor ingresa un texto");
        String text=sc.nextLine();
        System.out.println("por favor ingrese la palabra que desea buscar");
        String word=sc.nextLine();

        int pos=text.indexOf(word); // ubicación
         //se imprime la ubicacion


        while(pos!=-1){ // lo encuentro o no lo encuentro
            // lo encuentra sigue buscando
            cont++;
            pos++;
            pos=text.indexOf(word,pos); // nuevamente la busco sobre el texto;
        }
        System.out.println("cantidad de elmentos coincidentes con la palabra buscada: "+cont);
    }
}
