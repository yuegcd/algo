package algo.change;

import java.util.Arrays;

public class CoinChange2 {
    public int[] coinChange(int[] coins, int amount) {
        int[] result = new int[coins.length];
        Arrays.sort(coins);
        change(coins, amount, coins.length - 1, result);
        return result;
    }

    private void change(int[] coins, int reminder, int i, int[] result) {
        if (i < 0) {
            if (reminder == 0) return;
            if (reminder > 0) {
                result[0] = -1;
                return;
            }
        }
        int numberOfCoins = reminder / coins[i];
        result[i] = numberOfCoins;
        reminder = reminder % coins[i];
        change(coins, reminder, --i, result);
    }
}
