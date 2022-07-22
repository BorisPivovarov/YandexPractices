package main.java.Yandex.LinearSearch;

import java.util.Arrays;

/*
Дана последовательность чисел длиной n( > 1)
Найти максимальное числов последовательности и второе по величине число(такое, которое
будет максимальным, если вычеркнуть из последовательности одно максимальное число)
 */

public class TaskFour {
    public static void main(String[] args) {
        int[] array = new int[10];
        TaskOne.randomizer(array);

        System.out.println(Arrays.toString(array));
        searchMaxAndSecondMax(array);
    }
    private static void searchMaxAndSecondMax(int[] array) {
        int max = Math.max(array[0], array[1]);
        int max2 = Math.min(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            // сравниваем значение индекса с максимальным числом
            if (array[i] > max) {
                max2 = max;
                max = array[i];
                // так же если значение индекса больше второго макс числа
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }
        System.out.println(max + " " + max2);
    }
}
