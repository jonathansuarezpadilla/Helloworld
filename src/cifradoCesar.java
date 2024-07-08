import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cifradoCesar {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                //char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                List<String> alfabeto = Arrays.asList("a","b","c","d","e","f","g","h","i","j","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z");
                //List<String> especiales=Arrays.asList("!","¡","@","*","(",")","¿","?","-","#","$","&","="," ");
                String world =(sc.nextLine()).toLowerCase();
                String cifrado="";
                for(int i=0 ; i<world.length();i++){
                        char letra = world.charAt(i);


                        if(Character.isLetter(letra)){

                                for(String l: alfabeto){
                                        if(letra!="z".charAt(0) || letra!="x".charAt(0) || letra!="y".charAt(0) ){

                                                if(letra ==l.charAt(0)){

                                                        int secreta=alfabeto.indexOf(l);
                                                        cifrado+=alfabeto.get(secreta+3);
                                                }
                                        }
                                        else{
                                                if(letra =="x".charAt(0)){
                                                        cifrado+="a";
                                                }
                                                if(letra =="y".charAt(0)){
                                                        cifrado+="b";
                                                }
                                                if(letra =="z".charAt(0)){
                                                        cifrado+="c";
                                                }
                                        }

                                }




                        }
                        else{
                                cifrado+=letra;
                        }

                }
                System.out.println(cifrado);

                //decifrado
                String decifrado="";
                for(int i=0 ; i<cifrado.length();i++) {
                        char letra = cifrado.charAt(i);

                        if(Character.isLetter(letra)){

                                for (String l : alfabeto) {

                                        if (letra != "a".charAt(0) || letra != "b".charAt(0) || letra != "c".charAt(0)) {

                                                if (letra == l.charAt(0)) {

                                                        int secreta = alfabeto.indexOf(l);
                                                        decifrado += alfabeto.get(secreta - 3);
                                                }
                                        } else {
                                                if (letra == "a".charAt(0)) {
                                                        decifrado += "x";
                                                }
                                                if (letra == "b".charAt(0)) {
                                                        decifrado += "y";
                                                }
                                                if (letra == "c".charAt(0)) {
                                                        decifrado += "z";
                                                }
                                        }

                                }
                        }
                        else{
                                decifrado+=letra;
                        }

                }
                System.out.println(decifrado);
        }
}
