package com.playtika.at.LinkedListAlgoritm;

import java.util.Collections;
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

        //Создаем линкедЛист и заполняем его рендомно в пределах 100
        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < 100 ; i++) {
            randomList.add(i);
        }
        //перемешиваем все значения в листе
        Collections.shuffle(randomList);
        lastSummElement(randomList);
    }
    //делаем метод который будет сумировать ключ и значение и результат будет след ключ
    private static void lastSummElement(List<Integer> randomList) {

        //Заводим переменную счетчик кол-ва операций
        int counter = 0;
        //Заводим переменную, которая хранит текущий ключ
        int element = randomList.get(0);

        //Выполняем действие пока не достигнем результата, при етом первое дейстие нужно выполнить обязательно
        do {
            //проверяем чтоб ключ не вывалился за пределы листа
            //если выпал делим ключ пополам и пока не попадем в наш диапазон листа

            //если достигли крайнего елемента листа - выйти из цикла
        } while (!(element == randomList.get(randomList.size() - 1)));
        //напечатать в консоль кол-во операций
        System.out.println(counter);
    }
}
