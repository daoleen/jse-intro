package com.daoleen.javalearning.library.util.collection;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;
import static java.lang.System.out;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Comparator - интерфейс, определяющий методы сравнения двух объектов.
 * С помощью этого интерфейса можно лекго организовать сортировку коллекций.
 * Вот методы, определенные этим интерфейсом:
 * - int compare(T object1, T object2)
 * - boolean equals(Object obj)
 */
public class ComparatorLearning implements Comparator<String>, JavalearningRunnable {
    /**
     * Делаем обратное сравнение строк
     * Т.е. при сортировке получим обратную сортировку (по убыванию)
     */
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);    // обратное сравнение
    }


    @Override
    public void run() throws Exception {
        // создаем объект компаратора
        Comparator<String> comparator = new ComparatorLearning();

        // и указываем компаратор для TreeSet, по которому он будет сортировать
        TreeSet<String> ts = new TreeSet<String>(comparator);

        ts.add("a");
        ts.add("e");
        ts.add("b");
        ts.add("k");
        ts.add("z");
        ts.add("o");

        out.println(ts);
    }
}
