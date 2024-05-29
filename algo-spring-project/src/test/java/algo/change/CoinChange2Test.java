package algo.change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CoinChange2Test {
    CoinChange2 coinChange2 = new CoinChange2();

    @Test
    void should_return_empty_list_when_amount_is_0() {
        // given
        int[] coins = new int[]{186, 419, 83, 408};
        int amount = 0;
        // when
        int[] change = coinChange2.coinChange(coins, amount);
        // then
        int[] expected = new int[]{0, 0, 0, 0};
        assertArrayEquals(expected, change);
    }

    @Test
    void should_return_negative_list_when_cannot_make_change() {
        // given
        int[] coins = new int[]{2};
        int amount = 3;
        // when
        int[] change = coinChange2.coinChange(coins, amount);
        // then
        int[] expected = new int[]{-1};
        assertArrayEquals(expected, change);
    }

    @Test
    void should_test_example_1() {
        // given
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        // when
        int[] change = coinChange2.coinChange(coins, amount);
        // then
        int[] expected = new int[]{1, 0, 2};
        assertArrayEquals(expected, change);
    }

    @Test
    void should_test_example_2() {
        // given
        int[] coins = new int[]{186, 419, 83, 408};
        int amount = 6249;
        // when
        int[] change = coinChange2.coinChange(coins, amount);
        // then
        int[] expected = new int[]{1, 0, 2, 20};
        assertArrayEquals(expected, change);
    }

}