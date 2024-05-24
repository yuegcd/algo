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
        change(amount, denominations.size() - 1, result);
        return result;
    }

    private void change(int amount, int i, List<Integer> result) {
        if (i < 0) return;
        int numberOfCoins = amount / denominations.get(i);
        result.set(i, numberOfCoins);
        int reminder = amount - numberOfCoins * denominations.get(i);
        change(reminder, i - 1, result);
    }
}

/*
-- Time Complexity
- Outer change Method:
The outer change method initializes a list and calls the helper method change.
This initialization takes constant time, O(1), as the list size is fixed at 4.

- Recursive change Method:
The change method is recursively called once for each denomination.
Let's assume denominations has n elements.
The recursive method makes n calls, decrementing i each time until it reaches -1.
Each call performs constant-time operations: calculating the number of coins, updating the list, and computing the remainder.
Thus, the time complexity of the recursive method is O(n).
Therefore, the total time complexity is O(n), where n is the number of denominations.

-- Space Complexity
- Outer change Method:
The outer method initializes a list of size 4, which is O(1) space complexity.
- Recursive change Method:
The recursion depth is n because there is one recursive call for each denomination.
Each recursive call adds a frame to the call stack, so the space required for the call stack is O(n).

-- Auxiliary Space:
The result list is passed by reference, and its size does not change, so it takes O(1) space.
Thus, the overall space complexity is O(n) due to the call stack.
*/