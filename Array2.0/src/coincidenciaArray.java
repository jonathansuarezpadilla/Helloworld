import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class coincidenciaArray {
    public static void main(String[] args) {
        int lista[]={2,3,4,5,6,7,8,2,2,3,1,2};

        HashMap<Integer, Integer> elementCount=new HashMap<>();


        for(int number:lista){

            if(elementCount.containsKey(number)){
                elementCount.put(number,elementCount.get(number)+1); //
            }else{
                elementCount.put(number,1);
            }
        }
        // Sort the element counts by value (descending order)
        List<Map.Entry<Integer, Integer>> sortedCounts = new ArrayList<>(elementCount.entrySet());
        sortedCounts.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); // lambda

        System.out.println("Element | Count");
        System.out.println("-------|-------");
        for (Map.Entry<Integer, Integer> entry : sortedCounts) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

    }
}
