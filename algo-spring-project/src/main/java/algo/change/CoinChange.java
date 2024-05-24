package algo.change;

/*
You are given an integer list coins representing coins of different american denominations: [1,2,5,10]
and an integer amount representing a total amount of money.

Return an integer list representing the fewest number of coins that you need to make up that amount.

Example 1:
Input: denominations = [1,2,5,10], amount = 33
Output: [1,1,0,3]
Explanation:
[1,1,0,3] is okay, 3*10 + 1*2 + 1*1 = 33, cost 4 pieces changes
[3,0,0,3] is not, cost 6 pieces of changes, it is not optimal

Constraints:
0 <= amount <= 104
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    private final List<Integer> denominations = List.of(1, 2, 5, 10);

    public List<Integer> change(int amount) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        for (int i = denominations.size() - 1; i >= 0; i--) {
            int rest = amount % denominations.get(i);
            if (i == denominations.size() - 1) {
                result.set(i, amount / denominations.get(i));
            } else {
                result.set(i, amount % denominations.get(i + 1) / denominations.get(i));
            }
            if (rest == 0) break;
        }
        return result;
    }
}