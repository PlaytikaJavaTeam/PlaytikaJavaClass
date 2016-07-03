package com.playtika.at.LinkedListAlgoritm;

import java.util.LinkedList;
import java.util.List;

/**
 * Исходные данные: Есть интовый линкедЛист, заполненый рендомно, придумать алгоритм наименьшей сложности
 * который сумирует ключ и значение, результат - ключ след ентри, опять сумма ключ и значение и тд...
 * пока не будет достигнут последний елемент листа. Учесть верояность что сумма ключ и значение может
 * выбросить за пределы листа
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> randomList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            randomList.add(i, randInt(0 - i, 10 - i));
        }
        for (int rnd : randomList) {
            System.out.print(rnd + " ");
        }
        lastSummElement(randomList);
    }

    private static int randInt(int min, int max) {
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        return randomNum;
    }

    private static void lastSummElement(List<Integer> randomList) {

        int counter = 0;

        for (int i = 0; i < randomList.size() - 1; ) {
            i = i + randomList.get(i);
            counter++;
            System.out.println(i);

            if (i == randomList.size() - 1){
                System.out.println("WOW " + counter);
                break;
            } else if (counter > 10){
                break;
            }
        }
    }
}

