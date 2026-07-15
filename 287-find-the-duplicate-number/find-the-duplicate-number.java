class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer> mo = new HashMap<>();
          for (int i : nums) {
            mo.put(i , mo.getOrDefault(i, 0)+1);
        }

        int maxfreqKey = Integer.MIN_VALUE ;
        int maxfrequncy = Integer.MIN_VALUE;
       for (int key : mo.keySet()) {

            int currenKey = key;
            int currenKeyfreq = mo.get(key);
            if(currenKeyfreq > maxfrequncy){
                maxfrequncy = currenKeyfreq;
                maxfreqKey = currenKey;
            }
       }
       return maxfreqKey;
    }
}