class Solution {

    public boolean isAlphaNumeric(char c){
        return (c >='0' && c<= '9' || c >= 'a' && c<= 'z' || c >= 'A' && c<= 'Z'  );
    }
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;
         
         while(left< right ){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if(!isAlphaNumeric(c1)){
               left = left + 1;
                continue;
            }
            if(!isAlphaNumeric(c2)){
                right = right - 1;
                continue;
            }


            if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                return false ;
            }

            left = left + 1;
            right = right - 1;
         }
            return true;
        
    }
}