class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // minimum is in the right half
                left = mid + 1;
            } else {
                // minimum is in the left half (including mid)
                right = mid;
            }
        }

        // left == right → minimum element
        return nums[left];
    }
}
