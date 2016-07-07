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

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static int counter;

    public static void main(String[] args) {
        int preferredListSize = 10;
        int startFillList = 0;
        int startSearchElement = 0;

        List<Integer> randomList = new LinkedList<>();

        for (int i = 0; i < preferredListSize; i++) {
            randomList.add(i, randInt(startFillList - i, preferredListSize - i - 1));
        }
        for (int rnd : randomList) {
            System.out.print(rnd + " ");
        }
        System.out.println();
        arrayList.addAll(randomList);
        lastSumElement(startSearchElement);
    }

    private static int randInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static void lastSumElement(int entryElement) {

        counter++;

        if (entryElement == arrayList.size() - 1) {
            System.out.println("WOW, you're found it from " + counter + " attempt(s).");
        } else {
            entryElement = entryElement + arrayList.get(entryElement);
            arrayList.set(entryElement, null); // TODO think about realization
            try {
                lastSumElement(entryElement);
            } catch (NullPointerException e){
                System.out.println("Infinite loop.....on " + counter );
            }
        }
    }
}

