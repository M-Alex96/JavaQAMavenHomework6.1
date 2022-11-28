package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldFindTotalAmountOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.totalAmountOfSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void ShouldFindAverageAmountOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        int actualAmount = service.averageAmountOfSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void ShouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        long actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void ShouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        long actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void ShouldFindBelowAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.belowAverageMonths(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void ShouldFindAboveAverageMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.aboveAverageMonths(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
