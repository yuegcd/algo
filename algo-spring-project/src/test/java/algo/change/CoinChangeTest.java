package algo.change;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    CoinChange coinChange = new CoinChange();

    @Test
    void should_return_empty_list_when_amount_is_0() {
        // given
        int amount = 0;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        assertTrue(change.isEmpty());
    }

    @Test
    void should_change_amount_1() {
        // given
        int amount = 1;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(1, 0, 0, 0);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_2() {
        // given
        int amount = 2;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(0, 1, 0, 0);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_5() {
        // given
        int amount = 5;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(0, 0, 1, 0);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_10() {
        // given
        int amount = 10;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(0, 0, 0, 1);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_15() {
        // given
        int amount = 15;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(0, 0, 1, 1);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_20() {
        // given
        int amount = 20;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(0, 0, 0, 2);
        assertEquals(expected, change);
    }

    @Test
    void should_change_amount_33() {
        // given
        int amount = 33;
        // when
        List<Integer> change = coinChange.change(amount);
        // then
        List<Integer> expected = List.of(1, 1, 0, 3);
        assertEquals(expected, change);
    }
}