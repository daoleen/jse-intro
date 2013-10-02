package com.daoleen.javalearning.library.util.collection;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;
import static java.lang.System.out;
import java.util.HashSet;

/**
 * HashSet создает коллекцию, которая использует для храненения хеш-таблицу
 * Хеш-таблица хранит информацию, используя механизм хеширования, в котором содержимое
 * ключа используется для определения уникального значения, называемого хеш-кодом.
 * Этот хеш-код затем применяется в качестве индекса, с которым ассоциируются данные,
 * доступные по этому ключу. Преобразование ключа в хеш-код выполняется автоматически,
 * сам хеш код увидеть нельзя. Также наш код не может напрямую индексировать хеш-таблицу.
 * Выгода от хеширования состоит в том, что оно обеспечивает константное время выполнения
 * методов add(), contains(), remove() и size(), даже для больших наборов.
 * Класс HashSet не гарантирует упорядоченности элементов, поскольку процесс хеширования
 * сам по себе обычно не порождает сортированных наборов.
 */
public class HashSetLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        HashSet<String> hashSet = new HashSet<String>();

        out.println("Добавление элементов в хеш-таблицу. Такой же порядок не гарантируется!");
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("F");

        out.println(hashSet);
    }
}
