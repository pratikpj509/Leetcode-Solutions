class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            // If sum becomes negative, reset it
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum = nums[0];   // running sum
//         int maxSum = nums[0];    // best seen so far

//         for (int i = 1; i < nums.length; i++) {
//             // decide whether to start a new subarray or continue old one
//             currSum = Math.max(nums[i], currSum + nums[i]);
            
//             // update global max
//             maxSum = Math.max(maxSum, currSum);
//         }

//         return maxSum;
//     }
// }


// Let’s walk through like a flashlight traveling across hills:

// i	nums[i]	currSum calculation	currSum	maxSum
// 0	-2	start	                    -2	-2
// 1	1	max(1, -2+1=-1) → 1	1	1
// 2	-3	max(-3, 1-3=-2) → -2	-2	1
// 3	4	max(4, -2+4=2) → 4	4	4
// 4	-1	max(-1, 4-1=3) → 3	3	4
// 5	2	max(2, 3+2=5) → 5	5	5
// 6	1	max(1, 5+1=6) → 6	6	6
// 7	-5	max(-5, 6-5=1) → 1	1	6
// 8	4	max(4, 1+4=5) → 5	5	6