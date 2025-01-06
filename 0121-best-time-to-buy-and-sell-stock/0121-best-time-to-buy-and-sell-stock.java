class Solution {
    public int maxProfit(int[] arr) {
        int minStockValueTill_i = arr[0];
        int max_Profit_till_i = -1;
        for(int i=0;i<arr.length;i++){
            int profit = arr[i] - minStockValueTill_i;
            max_Profit_till_i = Math.max(max_Profit_till_i, profit);
            minStockValueTill_i = Math.min(minStockValueTill_i, arr[i]);
        }
        return max_Profit_till_i;
    }
}