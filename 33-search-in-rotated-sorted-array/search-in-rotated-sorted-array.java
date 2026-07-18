class Solution {

    public int pivotIndex(int[] nums){
        int n = nums.length;
        int s = 0; 
        int e = n-1;
        int ans = -1;

            if(nums[s] < nums[n-1]){
                return -1;
            }



         while(s <= e ){
            int mid = s + (e-s)/2;
            if(nums[mid] <= nums[n-1]){
                e = mid-1;
            }else{
                ans = mid;
                s = mid+1;
            }

         }

         return ans;
    }

    static int binarySearch(int[] nums , int s , int e , int target){
        while(s <= e ){
            int mid = s + (e-s)/2;
            if(target == nums[mid] ){
               return mid;
            }else if(target < nums[mid] ){
                 e = mid-1;
            }else{
                s = mid +1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {

        int n = nums.length;
        int s = 0 ; 
        int e = n-1;

        int pivot = pivotIndex(nums);
        int ap2 = pivot+1;

        if(pivot == -1){
            int ans = binarySearch(nums  ,s , e , target);
            return ans;
        }
        if(target <= nums[pivot] && target >= nums[s]){
            int ans = binarySearch(nums  ,s , pivot , target);
            return ans;
        }

        if(target <= nums[e] && target >= nums[pivot +1 ]){
            int ans = binarySearch(nums  , ap2, e , target);
            return ans;
        }

        return -1;
        
    }
}