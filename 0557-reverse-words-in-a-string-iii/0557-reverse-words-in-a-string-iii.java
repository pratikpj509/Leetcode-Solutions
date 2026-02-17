// Example 2:
// Input: s = "Mr Ding"
// Output: "rM gniD"

class Solution {
    public String reverseWords(String s) {

        // Split the sentence into words
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            // Reverse the word using StringBuilder
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            //IF REVERSE FUN YOU DONT WANT TO USE THEN USE BELOW 
            // Convert word to char array for reversing
            // Reverse characters of the current word USing while loop

            // Add reversed word to result
            result.append(sb);

            // Add space except after last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}






// class Solution {
//     public String reverseWords(String s) {

//         // Split the string into words using space as delimiter
//         String[] words = s.split(" ");

//         // StringBuilder to store final result
//         StringBuilder result = new StringBuilder();

//         // Traverse each word
//         for (int i = 0; i < words.length; i++) {

//             // Convert word to char array for reversing
//             char[] chars = words[i].toCharArray();

//             int left = 0;
//             int right = chars.length - 1;

//             // Reverse characters of the current word
//             while (left < right) {
//                 char temp = chars[left];
//                 chars[left] = chars[right];
//                 chars[right] = temp;
//                 left++;
//                 right--;
//             }

//             // Append reversed word to result
//             result.append(chars);

//             // Add space between words (not after last word)
//             if (i < words.length - 1) {
//                 result.append(" ");
//             }
//         }

//         return result.toString();
//     }
// }