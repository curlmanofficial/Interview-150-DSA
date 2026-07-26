class Solution {
     
    public int maximumProduct(int[] nums) {
          Arrays.sort(nums);
        int n = nums.length;

        // Case 1: three largest numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: two smallest (could be negative) * largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}