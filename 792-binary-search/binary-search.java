class Solution {
    static int solve(int[] arr , int target , int s , int e){
         if(s>e){

            return -1;

        }

        int mid  = s + (e-s)/2;

        if(arr[mid] == target){
             return mid;
        }
        if(arr[mid] < target){
            return solve(arr , target , mid+1 , e);
        } else{
            return  solve(arr , target , s , mid-1);
        }
            
       
    }
    public int search(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;

        int ans  = solve(nums , target , s ,e);
        return ans;
    }
}