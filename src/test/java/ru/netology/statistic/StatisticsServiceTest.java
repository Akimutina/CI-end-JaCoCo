package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMaxFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 110, 11, 12};
        long expected = 110;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findMaxTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 110, 11, 120};
        long expected = 120;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxRepeat() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {120, 5, 8, 4, 5, 120, 8, 6, 110, 11, 120};
        long expected = 120;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}