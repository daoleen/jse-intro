package com.daoleen.javalearning.library.util.observer;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Observable;
import java.util.Observer;
import static java.lang.System.out;

/**
 * Этот класс представляет наблюдателя.
 * Чтобы организовать наблюдение за объектом, следует реализовать интерфейс Observer.
 * Этот интерфейс определяет только один метод:
 * void update(Observable beingWatchedObj, Object arg)  , где
 * - beingWatchedObj - это объект, подлежащий наблюдению,
 * - arg             - значение, переданное методу notifyObservers()
 * Метод update вызывается при изменении наблюдаемого объекта.
 */
public class Watcher1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        out.println("[Watcher1] update() вызван, count = " + ((Integer)arg).intValue());
    }
}
