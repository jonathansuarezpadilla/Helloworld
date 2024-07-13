import java.util.Scanner;

public class coincidencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[]={"camila","silvana","roberto","carlos","hernan","laura","pedro","jorge","esteban","julian"};
        System.out.println("ingrese su nombre");
        String name=sc.nextLine();
        boolean isNot=false;
        for(int count=0;count<names.length;count++){
            String compare= names[count].toLowerCase();
            if(compare.equals(name)){
                isNot=true;
                System.out.println("la posición del nombre en la lista es: "+count);
            }

        }
        if(!isNot){
            System.out.println("el nombre no se encuentra en la lista");
        }
    }
}
