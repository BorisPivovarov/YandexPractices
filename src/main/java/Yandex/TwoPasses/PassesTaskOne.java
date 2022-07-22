package main.java.Yandex.TwoPasses;

import java.util.ArrayList;

/*
Дана последовательность слов
вывести все самые короткие слова через пробел
 */
public class PassesTaskOne {
    public static void main(String[] args) {
        String a = "andndn kajsd asd avd qwe asdasd aoe wer hhhhhd sdvskvn lvn asdqwer";
        System.out.println(findAllSmallStrings(a));
    }
    private static String findAllSmallStrings(String arr) {
        String[] array = arr.split("\\s");
        ArrayList<Object> arrayList = new ArrayList<>();
        String min = array[0];
        for (String s : array) {
            if (s.length() < min.length()) {
                min = s;
            }
        }
        for (String s : array) {
            if (s.length() == min.length()) {
                arrayList.add(s);
            }
        }
        return arrayList.toString();
    }
}
