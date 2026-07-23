class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount = -1;
        int maxRow = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        return new int[]{maxRow, maxCount};
    }
}