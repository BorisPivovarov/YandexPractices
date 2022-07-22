package main.java.Yandex.LinearSearch;

/*
Дана последовательность чисел длиной n
найти её последнее (правое) вхождение числа x
в неё или вывести -1 если число х не встречалось
 */
public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        TaskOne.randomizer(array);

        long m = System.nanoTime();
        System.out.println(searchLastOne(array, 5));
        System.out.println(System.nanoTime() - m);

        long n = System.nanoTime();
        System.out.println(searchTwo(array, 5));
        System.out.println(System.nanoTime() - n);

    }
    private static int searchLastOne(int[] array, int n) {
        int result = -1;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == n) {
                result = i;
                return result;
            }
        }
        return result;
    }

    private static int searchTwo(int[] input, int b) {
        int result = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == b) { // решение лектора, где проверяем, что присвоили результат первый раз
                result = i;
            }
        }
        return result;
    }

}
