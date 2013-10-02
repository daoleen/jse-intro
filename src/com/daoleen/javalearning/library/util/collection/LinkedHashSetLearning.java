package com.daoleen.javalearning.library.util.collection;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.LinkedHashSet;

import static java.lang.System.out;

/**
 * LinkedHashSet поддерживает связный список элементов набора в том порядке,
 * в котором они указывались. Это позволяет организовать упорядоченную итерацию
 * вставки в набор. Т.е. когда идет перебор объекта класса LinkedHashSet с
 * применением итератора, элементы извлекаются в том порядке, в котором они
 * были вставлены. С методом toString() аналогично.
 */
public class LinkedHashSetLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        LinkedHashSet<String> hashSet = new LinkedHashSet<String>();

        out.println("Добавление элементов в хеш-таблицу.");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("F");

        out.println(hashSet);
    }
}
