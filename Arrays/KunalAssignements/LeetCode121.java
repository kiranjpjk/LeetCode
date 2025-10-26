//121. Best Time to Buy and Sell Stock
public class LeetCode121 {
    public static void main(String[]args){
        int[] prices = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int currentSum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices) {
            if(price < currentSum) currentSum = price;
            int profit = price-currentSum;
            if(price > maxProfit) maxProfit= profit;
        }
        return maxProfit;
    }
}

