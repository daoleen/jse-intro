package com.daoleen.javalearning.library.util.observer;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 12:00 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Observable;
import java.util.Observer;
import static java.lang.System.out;

/**
 * Второй наблюдатель
 * Наблюдает на переменной count, когда она станет равна 0,
 * выдаст звуковой сигнал.
 */
public class Watcher2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(((Integer)arg).intValue() == 0) {
            out.println("[Watcher2] done... A beep will be playing now..." + '\7');
        }
    }
}
