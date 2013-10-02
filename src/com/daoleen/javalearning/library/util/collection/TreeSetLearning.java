package com.daoleen.javalearning.library.util.collection;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.TreeSet;

import static java.lang.System.out;

/**
 * TreeSet расширяет класс AbstractSet и реализует интерфейс NavigableSet.
 * Он создает коллекцию, которая для хранения элементов применяет дерево. Объекты
 * сохраняются в ОТСОРТИРОВАННОМ порядке по возрастанию. Время доступа и извлечения
 * элементов мало, что делает класс TreeSet блестящим выбором для хранения больших
 * объемов отсортированной информации, которая должна быть быстро найдена.
 * При сохранении элементов в TreeSet, они автоматически располагаются в
 * отсортированном порядке
 */
public class TreeSetLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        TreeSet<String> hashSet = new TreeSet<String>();

        out.println("Добавление элементов в TreeSet. Элементы автоматически отсортируются");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("F");

        out.println(hashSet);
    }
}
