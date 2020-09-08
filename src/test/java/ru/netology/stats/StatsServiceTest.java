package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


 class StatsServiceTest {
     public long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

     @Test
     void calculateSum() {
         StatsService service = new StatsService();

         long expected = 180;
         long actual = service.calculateSum(purchases);

         assertEquals(expected , actual);
     }


     @Test
     void findAveragePurchase() {
         StatsService service = new StatsService();
         long expected = 15;
         long actual = service.findAveragePurchase(purchases);

         assertEquals(expected , actual);
     }

     @Test
     void findMaxMonthOfPurchases() {
         StatsService service = new StatsService();

         long expected = 8;
         long actual = service.findMaxMonthOfPurchases(purchases);

         assertEquals(expected , actual);
     }

     @Test
     void findMinMonthOfPurchases() {
         StatsService service = new StatsService();

         long expected = 9;
         long actual = service.findMinMonthOfPurchases(purchases);

         assertEquals(expected , actual);
     }

     @Test
     void MonthsBelowAveragePurchase() {
         StatsService service = new StatsService();

         long expected = 5;
         long actual = service.MonthsBelowAveragePurchase(purchases);

         assertEquals(expected, actual);
     }

     @Test
     void MonthsAboveAverageOfSum() {
         StatsService service = new StatsService();

         long expected = 5;
         long actual = service.MonthsAboveAveragePurchase(purchases);

         assertEquals(expected, actual);

     }


 }



