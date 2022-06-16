package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);


        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAvg(purchases);


        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthWithMaxSale() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.numberMonthWithMaxSale(purchases);


        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthWithMinSale() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.numberMonthWithMinSale(purchases);


        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthCountWithMoreThanAvg() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.moreThanAvgCount (purchases);


        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnMonthCountWithLessThanAvg() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lessThanAvgCount (purchases);


        assertEquals(expected, actual);

    }
}
