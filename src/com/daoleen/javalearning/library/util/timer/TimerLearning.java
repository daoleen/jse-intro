package com.daoleen.javalearning.library.util.timer;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.Timer;

/**
 * Используя мощь классов Timer и TimerTask можно настроить
 * выполнение задачи в определенное время
 */
public class TimerLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();

        // устанавливает начальную паузу 1 секунду,
        // а затем выполняется каждые 0.5 секунд
        timer.schedule(myTimerTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            //timer.cancel();
        }

        timer.cancel();
    }
}
