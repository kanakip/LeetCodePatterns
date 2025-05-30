// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package Array;

public class BestTimeBuyAndSell {
	
    public static  int maxProfit(int[] prices) {
    	
    	  int max_profit = 0;
          int buy_price = prices[0];

          for(int i=0;i<prices.length;i++){
              int current_profit = prices[i] - buy_price;
              if(current_profit>max_profit){
                  max_profit = current_profit;
              }
              
              if(prices[i]<buy_price){
                  buy_price = prices[i];
              }
          }
          return max_profit;
    }
	
	
	public static void main(String args[]) {
		
		int[] prices = {7,1,5,3,6,4};
		
		int profit = maxProfit(prices);
		System.out.println(profit);
		
	}

}
