package main.java.Yandex.LinearSearch;

/*
Дана последоват чисел длиной n
найти минимальное четное число в последовательности
или вывести -1 если такого числа не существувует
 */

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        int[] array = new int[4];
        TaskOne.randomizer(array);

        System.out.println(Arrays.toString(array));
        System.out.println(searchMin(array));

    }
    private static int searchMin(int[] array) {
        int result = -1;
        boolean x = false;
        for (int j : array) {
            // проверка на четность, проверка, что четное и у нас первое такое число
            // или оно не первое, но меньше нашего результата
            if (j % 2 == 0 && (!x || j < result)) {
                result = j;
                x = true;
            }
        }
        return result;
    }
}
