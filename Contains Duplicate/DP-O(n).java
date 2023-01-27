class Solution {
    public int maxSubArray(int[] nums) {
        
        int Max_Sum= nums[0];
        int Curr_Sum=nums[0];

        for(int i=1; i< nums.length;i++){ //skip the first element-> aviod the case with only one element list

                 Curr_Sum = Math.max(nums[i],Curr_Sum+nums[i]); //if the sum is less then 0? Y-> Delect N-> Keep
                 Max_Sum = Math.max(Curr_Sum,Max_Sum);
            }     
        

        return Max_Sum;

    }
}
