//347. Top K Frequent Elements

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (descending)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}