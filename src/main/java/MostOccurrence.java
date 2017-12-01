import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostOccurrence {

    public int findMostOccurrence(int[] nums) {
        //using hash map to denote the number of occurrences
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = nums[0], occurrence = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > occurrence){
                max = entry.getKey();
                occurrence = entry.getValue();
            }
        }
        return max;
    }
}
