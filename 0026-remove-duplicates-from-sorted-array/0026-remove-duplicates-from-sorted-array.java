class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int cnt = 0; // position of last unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[cnt]) { // found a new unique number
                cnt++;
                nums[cnt] = nums[i]; // place it next
            }
        }

        return cnt + 1; // total unique elements
    }
    
}