package ru.netology.stats;

public class StatsService {

    public int totalAmountOfSales(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public int averageAmountOfSales(int[] sales) {
        int averageAmount;
        int totalAmount = totalAmountOfSales(sales);
        averageAmount = totalAmount / sales.length;
        return averageAmount;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageMonths(int[] sales) {
        int averageAmount = averageAmountOfSales(sales);
        int belowAverageMonthsAmount = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                belowAverageMonthsAmount++;
            }
        }
        return belowAverageMonthsAmount;
    }

    public int aboveAverageMonths(int[] sales) {
        int averageAmount = averageAmountOfSales(sales);
        int aboveAverageMonthsAmount = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                aboveAverageMonthsAmount++;
            }
        }
        return aboveAverageMonthsAmount;
    }
}
