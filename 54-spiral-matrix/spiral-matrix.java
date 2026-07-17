class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // sabse phele col ki length or  row lemngth nikal lenge

        int m = matrix.length;
        int n = matrix[0].length;

        //use phele ek list banenge 
        List<Integer> result = new ArrayList<>();

        // ab hum 4 pointer introduce karenge 

        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        // ab bada wala loop lagaenge 
        while (startingRow <= endingRow && startingCol <= endingCol) {
           //1111 //ab hum row ka loop banennge for col printing 
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
           //2222 // for row printint 
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

           //333 // for last row col printing 
            // checks bhi lagane padenge 
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            //444// for left side row printing 
            // check lga do

            if (startingCol <= endingCol) {

                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;

            }

        }
        return result;
    }
}