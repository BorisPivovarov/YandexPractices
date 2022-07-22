package main.java.Yandex.LectionThree;

/*дана последовательность положительных чисел длиной n и число х
надо найти два различных числа а и в из последовательности,
таких что а + в = х или вернуть 0 0 если нет
 */


import java.util.Arrays;
import java.util.HashSet;

public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[10];
        main.java.Yandex.LinearSearch.TaskOne.randomizer(array);


        System.out.println(Arrays.toString(array));

        sumABLinear(array, 8);
        sumAB(array, 8);


    }

    //поиск а линейное время (если что сложение идет по индексу, сами значения могут а = в)
    private static void sumABLinear(int[] array, int x) {
        HashSet<Integer> prevNums = new HashSet<>();
        for (int i : array) {
            if (prevNums.contains(x -i)) {
                System.out.println(i + " " + (x - i));
                return;
            }
            prevNums.add(i);
        }
        System.out.println(0 + " " + 0);
    }


    //решение за квадратичную сложность
    private static void sumAB(int[] array, int x) {
        for (int k : array) {
            for (int j : array) {
                if ((k + j == x) && (k != j)) {
                    System.out.print(k + " " + j);
                    return;
                }
            }
        }
        System.out.print(0 + " " + 0);
    }
}
