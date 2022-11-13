import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Question5 {

    public List<Integer> getPositions(int [] sortedArray, int [] inputInt) { 
        

        List<Integer> index = new LinkedList<>();
        Map<Integer, Integer> elementIndex= new HashMap<>();

        for (int i=0; i < sortedArray.length; i++ ) {

            if(!elementIndex.containsKey(sortedArray[i]))
                elementIndex.put(sortedArray[i], i);
        }

        
        // Assumption  - the second array all elements are present in the first array.
        for(int i : inputInt) {
            index.add(elementIndex.get(inputInt[i]));
        }
        
        return index;
    }
    
}
