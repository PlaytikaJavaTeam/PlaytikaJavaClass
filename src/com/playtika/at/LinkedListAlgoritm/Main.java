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
        int preferredListSize = 10000000;
        int startFillList = 0;
        int startSearchElement = 0;

        List<Integer> randomList = new LinkedList<>();

        long beforeAddLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i < preferredListSize; i++) {
            randomList.add(i, randInt(startFillList - i, preferredListSize - i - 1));
        }
        long afterAddLinkedListTime = System.currentTimeMillis();

        long beforeArrayCopyTime = System.currentTimeMillis();
        arrayList.addAll(randomList);
        long afterArrayCopyTime = System.currentTimeMillis();

        long beforeSearchTime = System.currentTimeMillis();
        lastSumElementFirstRealization(startSearchElement);
        //lastSumElementFinalRealization(startSearchElement);
        long afterSearchTime = System.currentTimeMillis();

        System.out.println("Filling LinkedList is " + (afterAddLinkedListTime - beforeAddLinkedListTime) + " ms.");
        System.out.println("Copying to ArrayList is " + (afterArrayCopyTime - beforeArrayCopyTime) + " ms.");
        System.out.println("Searching last element is " + (afterSearchTime - beforeSearchTime) + " ms.");
    }

    private static int randInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static void lastSumElementFinalRealization(int inputIndex) {

        counter++;
        int newIndex;

        if (inputIndex == arrayList.size() - 1) {
            System.out.println("WOW, you're found it from " + counter + " attempt(s).");
        } else {
            newIndex = inputIndex + arrayList.get(inputIndex);
            arrayList.set(inputIndex, null);
            try {
                lastSumElementFinalRealization(newIndex);
            } catch (NullPointerException e) {
                System.out.println("Infinite loop.....on " + counter + " jump.");
            }
        }
    }

    private static void lastSumElementFirstRealization(int inputIndex) {

        counter++;

        if (inputIndex == arrayList.size() - 1) {
            System.out.println("WOW, you're found it from " + counter + " attempt(s).");
        } else {
            inputIndex = arrayList.get(inputIndex) + inputIndex;
            System.out.println(inputIndex);
            lastSumElementFirstRealization(inputIndex);
        }
    }
}

