class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for (int i = 1; i < n; i++) {
            int num = nums[i];
            if (num < 0) {
                // swap, since multiplying by negative flips max/min
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            curMax = Math.max(num, curMax * num);
            curMin = Math.min(num, curMin * num);

            maxProd = Math.max(maxProd, curMax);
        }

        return maxProd;
    }
}