import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q6 {
        public static void main(String[] args){
        int[] array = {1,2,3,4,1,2,2,3,4,6,1,8,8,8};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            if (frequencyMap.containsKey(num))
                frequencyMap.computeIfPresent(num, (key, val) -> val + 1);
            else
                frequencyMap.put(num, 1);
        }
        System.out.println("\nBefore Sort:");
        System.out.println("Number Frequency");
        for (Map.Entry m : frequencyMap.entrySet()) {
            System.out.println("\t"+m.getKey() + "\t\t" + m.getValue());
        }

        HashMap<Integer, Integer> sortedMap = frequencyMap.entrySet().stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("\nAfter Sort:");
        System.out.println("\nNumber Frequency");
        for (Map.Entry m : sortedMap.entrySet()) {
            System.out.println("\t"+m.getKey() + "\t\t" + m.getValue());
        }
    }
}