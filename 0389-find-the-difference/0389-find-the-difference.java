class Solution {
    public char findTheDifference(String s, String t) {

        char result = 0;  // Initialize result to 0

        // XOR all characters of string s
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // XOR all characters of string t
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        // All matching characters cancel out,
        // remaining character is the extra one
        return result;
    }
}

// a ^ a = 0
// a ^ 0 = a
// XOR is commutative (order doesn't matter)