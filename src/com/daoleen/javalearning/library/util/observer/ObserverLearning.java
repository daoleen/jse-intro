package com.daoleen.javalearning.library.util.observer;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

/**
 * Класс Observable и интерфейс Observer из java.utils.* служат для
 * упрощения процесса наблюдения за объектом.
 * В данной программе создается 2 налюдателя за одним наблюдаемым объектом
 */
public class ObserverLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        BeingWatched observed = new BeingWatched();
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();

        observed.addObserver(observing1);
        observed.addObserver(observing2);
        observed.counter(5);
    }
}
