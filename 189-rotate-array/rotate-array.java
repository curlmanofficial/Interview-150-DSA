class Solution {
   public static void reverse(int[] arr , int left ,int right ){
    int i = left;
    int j = right;
    while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
   }

    public void rotate(int[] nums, int k) {
            k = k % nums.length;
            if(k<0){
                k= k + nums.length;
            }

        // 1
        reverse(nums , 0 , nums.length -k-1);

        //2
        reverse(nums , nums.length - k , nums.length -1);
        // all
        reverse( nums , 0 , nums.length - 1);
        
    }
}