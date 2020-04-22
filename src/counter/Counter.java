package counter;

import adds.Characters;
import java.util.HashMap;
import java.util.Map;

public class Counter {
    public  static  void  count (Characters[] data){
        Map<String, Integer> numbers = new HashMap<>();
        System.out.println();
        for (int i = 0; i < data.length; i++){
            String char_type = data[i].returnType();
            if(!numbers.containsKey(char_type)){
                numbers.put(char_type, 1);
            } else {
                numbers.put(char_type, numbers.get(char_type) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : numbers.entrySet()){
            System.out.println("Characters " + entry.getKey() + " type: " + entry.getValue());
        }
    }
}

