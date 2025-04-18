package DSAProblems.interviewPrep.dsaMostAsked;


public class BuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("profit : " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int profitMade = 0;
        for (int i = 0; i < prices.length; i ++){
            if (buyValue >= prices[i]){
                buyValue = prices[i];
            }
            profitMade = Math.max(profitMade, prices[i] - buyValue);
        }
        return profitMade;
    }

}
