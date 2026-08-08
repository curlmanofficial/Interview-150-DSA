class Solution {
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {
        // base case 
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        int curVal = nums[index];
        output.add(curVal);
        // exclude 
        solve(nums, index + 1, output, ans);

        // backtracking

        output.removeLast();

        //ab hum loop lagaenge ki hum uniq subset print kra sake 

        while(index+1 < nums.length && nums[index]==nums[index+1]){
            index++;
        }

        solve(nums, index + 1, output, ans);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums, index, output, ans);

        return ans;
    }
}