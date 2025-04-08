class Solution {
    public int[] finalPrices(int[] prices) {
        int[] discount = prices;
        int index = 0;
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(j > i && prices[j] <= prices[i]) {
                    discount[index] = prices[i] - prices[j];
                    break;
                }
            }
            index++;
        }
        return discount;
    }
}