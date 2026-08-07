class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        //  1st index me hum 1 put karenge or loop 1 suru karenge 

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // for right arr loop last ko 1 kar denge 

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // merge two array 

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;

    }
}