package com.daoleen.javalearning.library.util.timer;

import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("Задание таймера принято к выполнению");
    }
}
