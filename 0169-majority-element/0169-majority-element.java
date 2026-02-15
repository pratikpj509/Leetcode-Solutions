//169. Majority Element

// class Solution {
//     public int majorityElement(int[] nums) {
//        Map<Integer,Integer> map= new HashMap<>();
//        for(int n:nums){
//         map.put(n,map.getOrDefault(n,0)+1);
//         if(map.get(n)>nums.length/2){
//             return n;
//         }

//        }
//       return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}