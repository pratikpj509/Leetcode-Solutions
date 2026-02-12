class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Convert magazine into StringBuilder
        // So we can remove characters once they are used
        StringBuilder sb = new StringBuilder(magazine);

        // Loop through each character of ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            // Get current character from ransomNote
            char ch = ransomNote.charAt(i);

            // Find that character inside magazine
            int index = sb.indexOf(String.valueOf(ch));

            // If character not found, we cannot form ransomNote
            if (index == -1) {
                return false;   
            }

            // If found, remove that character from magazine
            // (so it cannot be reused again)
            sb.deleteCharAt(index);
        }

        // If all characters are found and removed successfully
        return true;
    }
}



// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {

//         // Array to store frequency of characters (a-z)
//         int[] charCount = new int[26];

//         // Count frequency of each character in magazine
//         for (char c : magazine.toCharArray()) {
//             charCount[c - 'a']++;
//         }

//         // Check if ransomNote can be formed
//         for (char c : ransomNote.toCharArray()) {
//             if (charCount[c - 'a'] == 0) {
//                 return false;   // character not available
//             }
//             charCount[c - 'a']--; // use one character
//         }

//         // If all characters are available
//         return true;
//     }
// }
