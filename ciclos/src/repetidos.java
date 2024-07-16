import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class repetidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine().toUpperCase();
        String abecedario="BCDFGHJKLMNÑPQRSTVWXYZ";
        String vowel="AEIOU";
        ArrayList<Integer> vowels= new ArrayList<>();
        ArrayList<Integer> consonants= new ArrayList<>();

        for (int i = 0; i <vowel.length(); i++) {
            int count=0;
            char otherVar=vowel.charAt(i);
            int pos=sentence.indexOf(otherVar);
            while(pos!=-1){
                count++;
                pos++;
                pos=sentence.indexOf(otherVar,pos);
            }

            vowels.add(count);
        }
        for (int i = 0; i <abecedario.length(); i++) {
            int count1=0;
            char otherVar1=abecedario.charAt(i);
            int pos1=sentence.indexOf(otherVar1);
            while(pos1!=-1){
                count1++;
                pos1++;
                pos1=sentence.indexOf(otherVar1,pos1);
            }

            consonants.add(count1);
        }
        int maximo= Collections.max(consonants);
        int position=consonants.indexOf(maximo);
        int maximo1= Collections.max(vowels);
        int position1=vowels.indexOf(maximo1);

       // System.out.println(vowels);
        //System.out.println(consonants);
        //System.out.println(position);
        System.out.println(abecedario.charAt(position));
        System.out.println(vowel.charAt(position1));
    }



}
