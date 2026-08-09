class Solution {
    static void solve(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> output) {

        // base case 
        if (target == 0) {
            ans.add(new ArrayList(output));
            return;
        } else if (index >= candidates.length || target < 0) {
            return;
        }

        int curValue = candidates[index];
        // indclude 

        output.add(curValue);
        solve(candidates, target - curValue, index+1, ans, output);

        // backtracking

        output.removeLast();

        // exclude
            while(index < candidates.length-1 && candidates[index] == candidates[index+1]){
                index++;
            }

        solve(candidates, target, index+1 , ans, output);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(candidates, target, index, ans, output);

        return ans;
    }
}