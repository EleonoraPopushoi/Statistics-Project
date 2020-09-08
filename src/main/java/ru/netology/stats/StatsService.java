package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long findAveragePurchase(long[] purchases) {
        long sum = 0;
        for (long d : purchases) {
            // d is defined as length
            sum += d;
        }

        return sum / purchases.length;

    }

    public long findMaxMonthOfPurchases(long[] purchases) {

        long max = getMax(purchases);


        long Maxmonth = 0;
        long month = 0;
        for (long purchase : purchases) {
            month++;
            if (purchase == max) {
                Maxmonth = month;
            }
        }
        return Maxmonth;
    }

    public long getMax(long[] purchases) {
        long max = 0;

        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    public long findMinMonthOfPurchases(long[] purchases) {
        long min = getMin(purchases);

        long Minmonth = 0;
        long month = 0;
        for (long purchase : purchases) {
            month++;
            if (purchase == min) {
                Minmonth = month;
            }
        }
        return Minmonth;
    }

    public long getMin(long[] purchases) {
        long min = purchases[0];

        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public long MonthsBelowAveragePurchase(long[] purchases) {

        long average = findAveragePurchase(purchases);
        long NumberMonthsBelowAverage = 0;
        for (long belowaveragepurchase : purchases) {
            if (belowaveragepurchase < average) {
                NumberMonthsBelowAverage++;
            }
        }
        return NumberMonthsBelowAverage;

    }


    public long MonthsAboveAveragePurchase(long[] purchases) {
        long average = findAveragePurchase(purchases);
        long NumberMonthsAboveAverage = 0;

        for (long aboveaveragepurchase : purchases) {
            if (aboveaveragepurchase > average) {
                NumberMonthsAboveAverage++;
            }
        }
        return NumberMonthsAboveAverage;
    }
}

