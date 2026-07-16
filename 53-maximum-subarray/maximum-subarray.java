class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i < nums.length ; i++){
            if(nums.length < 2){
                return nums[0];
            }

            sum = sum + nums[i] ;

            max = Math.max(sum , max );

            if(sum < 0){
                sum = 0;
            }

            

        }
         return max;
    }
}