import java.util.Scanner;

public class compresion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String cadena="";
        char characterNew=sentence.charAt(0);
        for(int i=0; i<sentence.length();i++){
            char character=sentence.charAt(i);
            if(character!=characterNew || i==0 ){
                characterNew=character;
                int pos=sentence.indexOf(character);
                int count=0;
                while(pos!=-1){
                    count++;
                    pos++;
                    pos=sentence.indexOf(character,pos);

                }
                cadena+=character+String.valueOf(count);
            }
        }
        System.out.println(cadena);

    }

}
