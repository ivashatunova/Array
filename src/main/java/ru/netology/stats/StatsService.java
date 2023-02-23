package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0; // Сумма всех продаж
        for (int s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int sumSales = sumSales(sales);
        return sumSales / sales.length;
    }

    public int peakSales(int[] sales) {
        int monthMaxSales = 0; // Номер месяца, в котором была максимальная продажа
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int minSales(int[] sales) {
        int monthMinSales = 0; // Номер месяца, в котором была минимальная продажа
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int monthBelowAverage(int[] sales) {
        int averageSum = averageSum(sales);
        int monthBelowAverage = 0;  // Количество месяцев, в которых продажи были ниже среднего
        for (int i : sales) {
            if (i < averageSum) {
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public int monthAboveAverage(int[] sales) {
        int averageSum = averageSum(sales);
        int monthAboveAverage = 0;  // Количество месяцев, в которых продажи были выше среднего
        for (int i : sales) {
            if (i > averageSum) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }
}

