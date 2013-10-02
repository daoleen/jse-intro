package com.daoleen.javalearning.library.util.collection;

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Класс LinkedList позволяет удобно реализовывать очередь
 * Очередь может быть однонаправленная и двунаправленная
 * Реализует такие интерфейсы как Queue, Deque...
 */
public class LinkedListLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        LinkedList<String> queue = new LinkedList<String>();
        queue.addFirst("first");
        queue.offer("second");
        queue.add(2, "third");
        String popElement = queue.remove();
        String popFirstElement = queue.removeFirst();
        String popLastElement = queue.removeLast();
    }
}
