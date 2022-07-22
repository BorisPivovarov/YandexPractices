package main.java.Yandex.LinearSearch;

// дана последовательность чисел длиной N
// найти первое(левое) вхождение положительного числа Х
// в неё или вывести -1, если число Х не встречалось


public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        randomizer(array);

        long m = System.nanoTime();
        System.out.println(searchOne(array, 3));
        System.out.println((System.nanoTime() - m));

        long n = System.nanoTime();
        System.out.println(searchTwo(array,3));
        System.out.println((System.nanoTime() - n));
    }

    public static void randomizer(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (0 + (Math.random() * 7));
        }
    }

    // решение быстрее при существовании ответа, но медленнее, если нет нужного числа
    private static int searchOne(int[] input, int b) {
        int result = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == b) {
                result = i;
                return result; // моё решение через выход из цикла после первой встречи значения
            }
        }
        return result;
    }
    private static int searchTwo(int[] input, int b) {
        int result = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == b && result == -1) { // решение лектора, где проверяем, что присвоили результат первый раз
                result = i;
            }
        }
        return result;
    }
}
