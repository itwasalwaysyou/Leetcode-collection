class Solution {
    public int maxSubArray(int[] nums) {
        
        int Max_Sum= nums[0];
        int Curr_Sum=nums[0];

        for(int i=1; i< nums.length;i++){

                 Curr_Sum = Math.max(nums[i],Curr_Sum+nums[i]);
                 Max_Sum = Math.max(Curr_Sum,Max_Sum);
            }     
        

        return Max_Sum;

    }
}
