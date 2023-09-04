public class BestTimetoBuyandSellStock {
    //dp
    public int maxProfit(int[] prices) {
        int maxDifference=0;
        int minNumber = prices[0];
        for(int i=0;i<prices.length;i++){
            if(minNumber>prices[i])
                minNumber=prices[i];
            else{
                if(prices[i]-minNumber>maxDifference)
                    maxDifference = prices[i]-minNumber;
            }
        }
        return maxDifference;
    }
}
