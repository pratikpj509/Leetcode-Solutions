class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==max || nums[i]==sec || nums[i]==third){
                continue;
            }

            if(nums[i]>max){
                third=sec;
                sec=max;                
                max=nums[i];
                
            }
            else if(nums[i]>sec){
               third=sec;
                sec=nums[i];
               
            }else if(nums[i]>third){
                    third=nums[i];
                 
            }
        }
           
        if(third== Long.MIN_VALUE){
            return (int)max;
        }
        
        return (int)third;
        
    }
}