package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimeStockBuySell {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        maxProfit(prices);

    }

    public static  int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
            System.out.println("prices = " + maxProfit +"----Min"+ minPrice);
        }

        return  maxProfit;

    }
}
