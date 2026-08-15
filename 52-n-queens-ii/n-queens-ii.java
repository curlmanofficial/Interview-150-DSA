class Solution {

      static boolean isSafeToPlace(int rowIndex , int colIndex , int n , char [][] board ){

            // for left straight 
            int row = rowIndex;
            int col = colIndex;
            while(col >= 0){
                if(board[row][col]=='Q'){
                    return false;
                }
                col--;
            }

            // left upper diagnal

            row = rowIndex;
            col = colIndex;
            while(row >= 0 && col >=0){
                if(board[row][col]=='Q'){
                    return false;
                }
                row--;
                col--;
            }

            // for left lower diagonal
            row = rowIndex;
            col = colIndex;
            while(row < n && col >=0){
                 if(board[row][col]=='Q'){
                    return false;
                }
                row++;
                col--;
            }

            return true;
        }

    static void solve(char [][] board,int n , int colIndex ,  List<List<String>> ans){
        //base case
        if(colIndex >= n){
            //hum agr out of bound nikal gaye h to hame combination mil gayi h

            // ab hum ek tem list banaenge because question says that store a row in form of list

            List<String> temp = new ArrayList<>();
           for(int i = 0 ;  i< n ;i++){
             temp.add(new String(board[i]));
           }
           ans.add(temp);
           return;
        }

        // tail recusion

        for(int rowIndex = 0 ; rowIndex < n ; rowIndex++){
             if(isSafeToPlace(rowIndex , colIndex , n ,board)){
                // palce the queen

                board[rowIndex][colIndex] = 'Q';
                // baki recursion ko dedo;
                solve(board , n , colIndex+1 , ans);

                // important step jise hum backtrack ya undo lhete h
                
                board[rowIndex][colIndex] = '.';


             }
          
        }

    }



   
    public int totalNQueens(int n) {
         char [][] board = new char[n][n];
        for(int i=0 ; i< n ;i++ ){
            Arrays.fill(board[i],'.');
        } 
        
        int colIndex = 0;
        List<List<String>> ans = new ArrayList<>();
    
        solve(board , n , colIndex , ans);

        int len = ans.size();

        if(len==1)
            return 1;
       
       return len;

    }
}