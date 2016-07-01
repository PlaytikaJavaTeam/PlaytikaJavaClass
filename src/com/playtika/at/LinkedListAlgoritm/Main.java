package com.playtika.at.LinkedListAlgoritm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Исходные данные: Есть интовый линкедЛист, заполненый рендомно, придумать алгоритм наименьшей сложности
 * который сумирует ключ и значение, результат - ключ след ентри, опять сумма ключ и значение и тд...
 * пока не будет достигнут последний елемент листа. Учесть верояность что сумма ключ и значение может
 * выбросить за пределы листа
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add(i);
        }
        Collections.shuffle(randomList);
        lastSummElement(randomList);
    }

    private static void lastSummElement(List<Integer> randomList) {

        Random randomGenerator = new Random();
        int counter = 0;

        for (int i = 0; i < randomList.size(); ) {
            i += randomList.get(i);
            counter++;

            if (i > randomList.size() - 1) {
                i = randomGenerator.nextInt(99);

            } else if (i == 99) {
                System.out.println(counter);
            }
        }
    }
}

