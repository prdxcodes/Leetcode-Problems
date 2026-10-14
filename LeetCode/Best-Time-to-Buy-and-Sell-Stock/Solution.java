1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5
6        for (int i = 0; i < prices.length; i++) {
7            if (prices[i] < minPrice) {
8                minPrice = prices[i];
9            } else {
10                int profit = prices[i] - minPrice;
11
12                if (profit > maxProfit) {
13                    maxProfit = profit;
14                }
15            }
16        }
17
18        return maxProfit;
19    }
20}