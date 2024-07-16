import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Eliminacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingrese una frase");
        String world= sc.nextLine();

        ArrayList<String> sentence= new ArrayList<>();

        String palabra="";


        //StringBuilder cadena= new StringBuilder();
        for(int i=0;i<world.length() ;i++){

            char letra=world.charAt(i);

            if(letra!=' '){
                palabra+=letra;
            }
            else{

                if(palabra.length() >0){

                    sentence.add(palabra);
                    palabra="";
                }
            }



        }
        sentence.add(palabra);


        for(int i=0;i<sentence.size() ;i++){
            //System.out.println(l);

            int count=0;
            Iterator<String> iterador=sentence.iterator();

            while(iterador.hasNext()){
                String j= iterador.next();

                if(sentence.get(i).equals(j)){
                    count++;
                    if(count>1){
                        iterador.remove();
                    }
                }
            }

        }
        System.out.println(sentence);
    }
}
