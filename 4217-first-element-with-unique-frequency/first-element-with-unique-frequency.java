class Solution {
    public int firstUniqueFreq(int[] nums) {

        HashMap<Integer , Integer> list = new HashMap<>();

        for(int i: nums){
            list.put(i , list.getOrDefault(i , 0)+1);

        }

         HashMap<Integer, Integer> freqCount = new HashMap<>();
         
            for (int freq : list.values()) {
            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
        }
         for (int num : nums) {
            if (freqCount.get(list.get(num)) == 1) {
                return num;
            }
        }
        
        return -1;
    }
}