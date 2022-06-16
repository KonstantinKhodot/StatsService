package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAvg(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public int numberMonthWithMaxSale(int[] purchases) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : purchases) {
            if (sale >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int numberMonthWithMinSale(int[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (long sale : purchases) {
            if (sale <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int moreThanAvgCount(long[] items) {
        int avg = (int) calculateAvg(items);
        int count = 0;
        for (long item : items) {
            if (item > avg) count++;
        }
        return count;
    }

    public int lessThanAvgCount(long[] items) {
        int avg = (int) calculateAvg(items);
        int count = 0;
        for (long item : items) {
            if (item < avg) count++;
        }
        return count;
    }
}
