class Solution {
    public int maxProduct(int n) {
          String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        
        // Step 2: brute-force check every pair of digits
        int maxProd = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (i != j) { // different positions (same digit value is fine)
                    maxProd = Math.max(maxProd, digits[i] * digits[j]);
                }
            }
        }
        
        return maxProd;
    }
}