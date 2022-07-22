package main.java.Yandex.LinearSearch;

// найти максимальное число в последовательности

public class TaskThree {
    public static void main(String[] args) {
        int[] array = new int[1000000];

        TaskOne.randomizer(array);

        long m = System.nanoTime();
        System.out.println(searchMax(array));
        System.out.println(System.nanoTime() - m);

        long n = System.nanoTime();
        System.out.println(searchMaxSecond(array));
        System.out.println(System.nanoTime() - n);
    }
    private static int searchMax(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int result = array[0];
        for(int i = 1; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    private static int searchMaxSecond(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int result = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[result] < array[i]) {
                result = i;
            }
        }
        return array[result];
    }
}
