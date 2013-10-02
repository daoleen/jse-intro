package com.daoleen.javalearning.library.util.collection;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */


import com.daoleen.javalearning.JavalearningRunnable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import static java.lang.System.out;

/**
 * Iterator - итерфейс, служащий для перебора элеметов коллекции.
 * Интерфейс Iterator позволяет организовать цикл для перебора коллекции,
 * получая либо удаляя элементы.
 * Интерфейс ListIterator расширяет интерфейс Iterator для обеспечения
 * двунапрявленного прохода по списку и модификации элементов.
 * Каждый класс коллекций предлагает метод iterator(), который возвращает
 * итератор на начало коллекции. Используя объект итератора, можно получить
 * доступ к каждому элементу коллекции - одному за другим.
 * Для коллекций, реализующих интерфейс List, можно получить ListIterator,
 * воспользовавшись методом listIterator().
 *
 * Итераторы очень удобно применять когда нужно пройтись по коллекции в
 * обратном порядке или модифицировать элементы.
 * Иначе лучше использовать цикл "for-each" (который не может
 * модифицировать элементы!)
 */
public class IteratorLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("B");
        list.add("A");
        list.add("D");
        list.add("E");
        list.add("C");
        list.add("F");

        out.println("Исходное содержимое list:");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            String item = itr.next();
            out.println("Item: " + item);
        }

        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            String item = listItr.next();
            out.println("Item by ListIterator: " + item);

            // модификация элемента через ListIterator
            listItr.set(item + " modified");
        }

        out.println("Модифицированное через ListIterator содержимое:");
        itr = list.iterator();
        while (itr.hasNext()) {
            String item = itr.next();
            out.println(item);
        }
        out.println();

        // Отображение содержимого в обратном порядке
        out.println("Содержимое в обратном поряке");
        while (listItr.hasPrevious()) {
            String item = listItr.previous();
            out.println(item);
        }
    }
}
