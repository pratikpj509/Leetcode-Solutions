class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}



// //3. Longest Substring Without Repeating Characters

// import java.util.*;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         Map<Character, Integer> map = new HashMap<>();
//         int left = 0;
//         int maxLen = 0;

//         for (int i = 0; i < s.length(); i++) {

//             char ch = s.charAt(i);

//             if (map.containsKey(ch)) {
//                 left = Math.max(left, map.get(ch) + 1);
//             }

//             map.put(ch, i);
//             maxLen = Math.max(maxLen, i - left + 1);
//         }

//         return maxLen;
//     }
// }
