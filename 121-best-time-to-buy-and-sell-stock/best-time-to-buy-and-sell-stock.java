class Solution {
    public int maxProfit(int[] prices) {

    int left = 0;
    int right = 1;
    int maxp = 0;
    int n = prices.length;

        while(right < n){

            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxp = Math.max(maxp , profit);
            }else{
                left = right;   
            }
              right++;

        }
        return maxp;
    }
}