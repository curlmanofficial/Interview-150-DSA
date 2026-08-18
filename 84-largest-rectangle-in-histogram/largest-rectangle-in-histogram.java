class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        int[] left = new int[n];
        int[] right = new int[n];

        //next smalest element in left side 
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);

        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        // for right side 

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);

        }

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currAns = heights[i] * width;

            ans = Math.max(ans, currAns);

        }

        return ans;
    }
}