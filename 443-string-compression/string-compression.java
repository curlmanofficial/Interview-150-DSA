class Solution {
    public int compress(char[] str) {
        int index = 0; // position to write in the array
        int i = 0;

        while(i < str.length) {
            char curr = str[i];
            int count = 0;

            // Count consecutive same characters
            while(i < str.length && str[i] == curr) {
                i++;
                count++;
            }

            // Write the character
            str[index++] = curr;

            // Write the count if greater than 1
            if(count > 1) {
                for(char c : String.valueOf(count).toCharArray()) {
                    str[index++] = c;
                }
            }
        }

        return index; // return the new length
    }
}