class Solution {
    public int maxProfit(int[] prices) {
        int currentProfit = 0;
        int currentMin = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(currentMin > prices[i]){
                currentMin = prices[i];;
            }
            
            if(currentProfit < prices[i] - currentMin){
                currentProfit = prices[i] - currentMin;
            }

            
        }


        return currentProfit;
    }


}
