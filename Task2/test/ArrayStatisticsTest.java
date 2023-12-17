package Task2.test;

import Task2.ArrayStatistics.ArrayStatistics;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStatisticsTest {

    @Test
    void mode() {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{});
        assertEquals(0, arrayStatistics.mode());
        ArrayStatistics arrayStatisticsTwo = new ArrayStatistics(new int[]{10});
        assertEquals(10, arrayStatisticsTwo.mode());
        ArrayStatistics arrayStatisticsThree = new ArrayStatistics(new int[]{10, 10, 11});
        assertEquals(10, arrayStatisticsThree.mode());
        ArrayStatistics arrayStatisticsFour = new ArrayStatistics(new int[]{10, 10, 11, 2, 2, 2, 2, 5, 6, 5});
        assertEquals(2, arrayStatisticsFour.mode());

        Random random = new Random(15);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
        ArrayStatistics arrayStatisticsFive = new ArrayStatistics(array);
        assertEquals(-142018736, arrayStatisticsFive.mode());
    }

    @Test
    void median() {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{});
        assertEquals(0, arrayStatistics.median());
        ArrayStatistics arrayStatisticsTwo = new ArrayStatistics(new int[]{10});
        assertEquals(10, arrayStatisticsTwo.median());
        ArrayStatistics arrayStatisticsThree = new ArrayStatistics(new int[]{10, 10, 11});
        assertEquals(10, arrayStatisticsThree.median());
        ArrayStatistics arrayStatisticsFour = new ArrayStatistics(new int[]{8, 8, 37, 8, 9 ,10, 1, 70});
        assertEquals(8, arrayStatisticsFour.median());

        /*Random random = new Random(15);
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
        ArrayStatistics arrayStatisticsFive = new ArrayStatistics(array);
        assertEquals(-142018736, arrayStatisticsFive.mode());*/
    }

    @Test
    void average() {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{});
        assertEquals(0, arrayStatistics.average());
        ArrayStatistics arrayStatisticsTwo = new ArrayStatistics(new int[]{10});
        assertEquals(10, arrayStatisticsTwo.average());
        ArrayStatistics arrayStatisticsThree = new ArrayStatistics(new int[]{9, 9, 12});
        assertEquals(10, arrayStatisticsThree.average());
        ArrayStatistics arrayStatisticsFour = new ArrayStatistics(new int[]{8, 8, 37, 8, 9 ,10, 1, 70});
        assertEquals(18.875, arrayStatisticsFour.average());
    }

    @Test
    void variance() {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{});
        assertEquals(0, arrayStatistics.variance());
        ArrayStatistics arrayStatisticsTwo = new ArrayStatistics(new int[]{10});
        assertEquals(0, arrayStatisticsTwo.variance());
        ArrayStatistics arrayStatisticsThree = new ArrayStatistics(new int[]{9, 9, 12});
        assertEquals(6, arrayStatisticsThree.variance());
        ArrayStatistics arrayStatisticsFour = new ArrayStatistics(new int[]{8, 8, 37, 8, 9 ,10, 1, 70});
        assertEquals(3792.875, arrayStatisticsFour.variance());
    }

    @Test
    void geometricMean() {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{});
        assertEquals(0, arrayStatistics.geometricMean());
        ArrayStatistics arrayStatisticsTwo = new ArrayStatistics(new int[]{9});
        assertEquals(3, arrayStatisticsTwo.geometricMean());
        ArrayStatistics arrayStatisticsThree = new ArrayStatistics(new int[]{1, 8, 50});
        assertEquals(20, arrayStatisticsThree.geometricMean());
        ArrayStatistics arrayStatisticsFour = new ArrayStatistics(new int[]{8, 8, 37, 8, 9 ,10, 1, 70});
        assertEquals(10924.6144096714, arrayStatisticsFour.geometricMean());
    }
}