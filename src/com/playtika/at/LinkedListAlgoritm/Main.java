package com.playtika.at.LinkedListAlgoritm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Исходные данные: Есть интовый линкедЛист, заполненый рендомно, придумать алгоритм наименьшей сложности
 * который сумирует ключ и значение, результат - ключ след ентри, опять сумма ключ и значение и тд...
 * пока не будет достигнут последний елемент листа. Учесть верояность что сумма ключ и значение может
 * выбросить за пределы листа
 */
public class Main {

    private static ArrayList<Integer> inputElementsList = new ArrayList<>();
    private static int counter;

    public static void main(String[] args) {
        int preferredListSize = 100;
        int startFillList = 0;
        int startSearchElement = 1;

        List<Integer> randomList = new LinkedList<>();

        for (int i = 0; i < preferredListSize; i++) {
            randomList.add(i, randInt(startFillList - i, preferredListSize - i - 1));
        }
        for (int rnd : randomList) {
            System.out.print(rnd + " ");
        }
        System.out.println();
        lastSumElement(randomList, startSearchElement);
    }

    private static int randInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static void lastSumElement(List<Integer> randomList, int entryElement) {

        counter++;

        if (entryElement == randomList.size() - 1) {
            System.out.println("WOW, you're found it from " + counter + " attempt(s).");
        } else if (inputElementsList.contains(entryElement)) {
            System.out.println("infinite loop...Run again.");
        } else {
            inputElementsList.add(entryElement);
            entryElement = randomList.get(entryElement) + entryElement;
            lastSumElement(randomList, entryElement);
        }
    }
}

