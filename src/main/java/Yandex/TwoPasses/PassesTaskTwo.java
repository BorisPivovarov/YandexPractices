package main.java.Yandex.TwoPasses;

import main.java.Yandex.LinearSearch.TaskOne;

import java.util.Arrays;

/*
игра питкрафт происходит в двумерном мире, который состоит из блоков 1*1 метр
Остров игрока представляет собой набор столбцов различной высоты, состоящих
из блоков камня и окруженный морем. над островом прошел сильный дождь, который заполнил водой все низины,
а не поместившаяся вода стекла в море не увеличив его.

Определить по ландшафту острова сколько блоков воды осталось после дождя в низинах острова.
 */
public class PassesTaskTwo {
    public static void main(String[] args) {
        int[] array = new int[10];
        TaskOne.randomizer(array);

        System.out.println(Arrays.toString(array));
        System.out.println(searchWater(array));
    }
    private static int searchWater(int[] array) {
        int result = 0;
        int index = 0;
        int nowMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }
        for (int i = 0; i < index; i++){
            if(array[i] > nowMax) {
                nowMax = array[i];
            }
            result += nowMax - array[i];
        }
        nowMax = 0;
        for(int i = array.length - 1; i > index; i--) {
            if(array[i] > nowMax) {
                nowMax = array[i];
            }
            result += nowMax - array[i];
        }
        return result;
    }
}
