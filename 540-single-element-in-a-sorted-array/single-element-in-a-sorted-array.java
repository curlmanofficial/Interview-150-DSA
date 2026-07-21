class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int mid = 0;

        while(s < e){
             mid = s +(e-s)/2;
            // if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1] ){
                // return nums[mid];
            // }

            if((mid & 1) != 0){
                mid = mid-1;
            }
            if(nums[mid] == nums[mid+1]){
                s = mid+2 ;
            }else{
                e=mid;
            }
            
        }
        return nums[s];
        
    }
}