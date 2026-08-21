class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans =0;
        int s =0;
        int e = n-1;
        int leftmax = 0;
        int rightmax = 0;

        while(s < e){
            leftmax = Math.max(leftmax , height[s]);
            rightmax = Math.max(rightmax , height[e]);

            if(leftmax < rightmax){
                ans += leftmax - height[s];
                s++;
            }else{
                ans += rightmax - height[e];
                e--; 
            }
  
        }

        return ans;

    }
}