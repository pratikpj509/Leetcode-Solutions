class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb= new StringBuilder(haystack);
        int idx= sb.indexOf(needle);

        return idx;
    }
}