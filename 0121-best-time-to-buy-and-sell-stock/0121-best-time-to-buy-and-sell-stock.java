class Solution {
    public int maxProfit(int[] prices) {
       // [7,1,5,3,6,4]
       int n = prices.length;
       int maxPrice = prices[n-1];
       int result = 0;
       for(int i=prices.length-1;i>=0;i--){
            if(prices[i] < maxPrice){
                int gain = maxPrice - prices[i];
                result = Math.max(result, gain);
            }
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
            }
           
       }
       return result;
       
    }
}