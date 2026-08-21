class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // answer ke liye ab hum ek ans variable create karenge

        int ans = 0; 

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        // ab hum issme leftmax ka phla element as it is paste kardenge 
        leftmax[0] = height[0];
        // ese hi hum rightmaxme last wal element dal denge 
        rightmax[n-1] = height[n-1];

        // ab hum loop chalaenge for letmax or rightmax ke liye 

        //leftmax ke liye 

        for(int i=1 ; i< n ;i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        // for rightmax
        for(int i = n-2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1] , height[i]);
        }
       
       // ab ans calculate karenge 

       for(int i =0 ; i<n; i++){
        ans += Math.min(leftmax[i] , rightmax[i]) - height[i];
       }

       return ans;

    }
}