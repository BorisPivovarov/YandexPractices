package main.java.Yandex.TwoPasses;
/*
Дана строка (мб пустая) состоящая и букв A-Z:
нужно написать функцию RLE которая на выходе выдаст строку вида
A4B3C4XZS32. И сгенерирует ошибку если на вход пришла пустая строка
один символ без именений, если подряд несколько, то символ и количество
 */

import java.util.ArrayList;

public class RLETask {
    public static void main(String[] args) {
        String a = "AAAAAABBBBCCCKSLXMSL";
        String b = "";
        String c = "SSSSSNNNNNAAAAABSDHAAA";

        rleFunction(a);
        System.out.println();
        rleFunction(b);
        System.out.println();
        rleFunction(c);

    }

    private static void rleFunction(String array) {
        ArrayList<Object> arrayList = new ArrayList<>();
        if (array.isEmpty()) {
            System.out.print("String is empty");
            return;
        }
        char[] chars = array.toCharArray();
        int count = 1;
        char lastSymbol = chars[0];
        int lastPosition = 0;
        if (chars.length > 1) {
            // перебор массива
            for (int i = 1; i < chars.length; i++) {
                // если последний символ != символу по индексу
                if (lastSymbol != chars[i]){
                    //добавляем его
                    arrayList.add(lastSymbol);
                    //также если раница количества символов больше еденицы
                    // добавляем это количество в массив
                    if ((i - lastPosition) > 1) {
                        arrayList.add(i - lastPosition);
                    }
                    // устанавливаем место последней позиции и последнего символа
                    lastPosition = i;
                    lastSymbol = chars[i];
                }
            }
            // добавка в массив последнего числа и его количества
            arrayList.add(lastSymbol);
            if ((chars.length - lastPosition) > 1) {
                arrayList.add(chars.length - lastPosition);
            }
        }
        // вывод массива символов побуквенно
        for (Object o : arrayList) {
            System.out.print(o);
        }
    }
}
