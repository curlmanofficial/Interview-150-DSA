class Solution {
    public String smallestPalindrome(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        StringBuilder half = new StringBuilder();
        String mid = "";
        
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (cnt[i] % 2 == 1) {
                mid = String.valueOf(c);
            }
            for (int j = 0; j < cnt[i] / 2; j++) {
                half.append(c);
            }
        }
        
        String halfStr = half.toString();
        String reversedHalf = new StringBuilder(halfStr).reverse().toString();
        
        return halfStr + mid + reversedHalf;
    }
}