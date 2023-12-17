package Task2.ArrayStatistics;


public class ArrayStatistics {
    int[] array;


    public ArrayStatistics(int[] array) {
        this.array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = new int[array.length];
        for (int i = 0; 0 < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public int mode() {
        int mode = 0;
        if (array.length != 0) {
            mode = array[0];
            int cnt = 1;
            int maxCnt = 1;
            bubbleSort(array);
                for (int i = 1; i < array.length; i++) {
                    if (array[i] == array[i - 1]) {
                        cnt++;
                    } else if (maxCnt < cnt) {
                        maxCnt = cnt;
                        cnt = 1;
                        mode = array[i - 1];
                    }
                }
        }
        return mode;
    }
    public double median() {
        if (array.length != 0) {
            bubbleSort(array);
            if (array.length % 2 == 0) {
                return (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
            } else {
                return array[array.length / 2];
            }
        }return 0;
    }
    public double average () {
        if (array.length != 0) {
            double average = 0;
            for (int i = 0; i < array.length; i++) {
                average += array[i];
            }
            average /= array.length;
            return average;
        }
        return 0;
    }
    public double variance() {
        if (array.length != 0) {
            double average = this.average();
            double variance = 0;
            for (int i = 0; i < array.length; i++) {
                variance += Math.pow((average - array[i]), 2);
            }
            return variance;
        }
        return 0;
    }
    public double geometricMean() {
        if (array.length != 0) {
            double geometricMean = 1;
            for (int i = 0; i < array.length; i++) {
                geometricMean *= array[i];
            }
            return Math.sqrt(geometricMean);
        }
        return 0;
    }
}