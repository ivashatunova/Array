package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findSum() {
        StatsService sumService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = sumService.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageSum() {
        StatsService averageSumService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;
        int actualAverageSum = averageSumService.averageSum(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void findPeakSales() {
        StatsService peakSalesService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedPeakSales = 8;
        int actualPeakSales = peakSalesService.peakSales(sales);
        Assertions.assertEquals(expectedPeakSales, actualPeakSales);
    }

    @Test
    public void findMinSales() {
        StatsService minSalesService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = minSalesService.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void findMonthBelowAverage() {
        StatsService monthBelowAverageService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthBelowAverage = 5;
        int actualMonthBelowAverage = monthBelowAverageService.monthBelowAverage(sales);
        Assertions.assertEquals(expectedMonthBelowAverage, actualMonthBelowAverage);
    }

    @Test
    public void findMonthAboveAverage() {
        StatsService monthAboveAverageService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthAboveAverage = 5;
        int actualMonthAboveAverage = monthAboveAverageService.monthBelowAverage(sales);
        Assertions.assertEquals(expectedMonthAboveAverage, actualMonthAboveAverage);
    }
}


