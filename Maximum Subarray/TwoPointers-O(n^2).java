class Solution {
    public int maxSubArray(int[] nums) {
        
        int Max_Sum= nums[0];
        int Curr_Sum=0;


        int len= nums.length;

        for(int i=0; i< len;i++){
            Curr_Sum=0;

            for(int j=i;j<len ;j++){
                 Curr_Sum = Curr_Sum+ nums[j];
                 Max_Sum = Math.max(Curr_Sum,Max_Sum);
            }     
        }

        return Max_Sum;

    }
}



