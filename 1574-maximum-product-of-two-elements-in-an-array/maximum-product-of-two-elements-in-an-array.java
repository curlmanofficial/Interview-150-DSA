class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mul = (nums[n-2]-1)*(nums[n-1]-1);

        return mul;
    }
}