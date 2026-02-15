class Solution {
    public int removeElement(int[] nums, int val) {
       int j = 0; // pointer for the next valid position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // if the element is not equal to val, keep it
                nums[j] = nums[i];
                j++;
            }
        }
        return j; // number of remaining elements
    }
}