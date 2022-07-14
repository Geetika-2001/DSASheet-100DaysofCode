public class buysellstock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 4, 6, 3 };
        int n = prices.length;
        System.out.println(max_profit(prices, n));
    }

    static int max_profit(int[] prices, int n) {
        int buy = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > max) {
                max = prices[i] - buy;
            }

        }
        return max;

    }
}
