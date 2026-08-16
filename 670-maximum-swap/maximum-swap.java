class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();

        // Store the last occurrence of each digit
        int[] last = new int[10];

        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }

        // Try to make the leftmost digit as large as possible
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i] - '0';

            // Check larger digits from 9 to current + 1
            for (int digit = 9; digit > current; digit--) {

                // Larger digit exists after current position
                if (last[digit] > i) {
                    // Swap
                    char temp = arr[i];
                    arr[i] = arr[last[digit]];
                    arr[last[digit]] = temp;

                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }
}