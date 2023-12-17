package Task2;

import Task2.ArrayStatistics.ArrayStatistics;

public class Main {
    public static void main(String[] args) {
        ArrayStatistics arrayStatistics = new ArrayStatistics(new int[]{8, 8, 37, 8, 9 ,10, 1, 70});
        System.out.println(arrayStatistics.mode());
        System.out.println(arrayStatistics.median());
        System.out.println(arrayStatistics.average());
        System.out.println(arrayStatistics.geometricMean());
    }
}
