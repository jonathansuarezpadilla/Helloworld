import java.util.ArrayList;

public class invertirArray {

    public static void main(String[] args) {
        int lista[]={2,3,4,5,6,7};
        ArrayList<Integer> invertida=new ArrayList<>();
        for(int i=lista.length-1;i>=0;i--){
            invertida.add(lista[i]);
        }

        System.out.println(invertida);
    }
}
