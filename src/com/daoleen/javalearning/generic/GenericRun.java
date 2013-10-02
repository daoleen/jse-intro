package com.daoleen.javalearning.generic;

import com.daoleen.javalearning.JavalearningRunnable;
import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericRun implements JavalearningRunnable {
    private void simple() {
        double average;
        Numerics<Integer> integers = new Numerics<Integer>(new Integer[] { 2, 5, 2, 1, 10, 14, 21 });
        average = integers.getAverage();
        out.println("The average for integers are: " + average);

        Numerics<Float> floats = new Numerics<Float>(new Float[] { 2.1f, 3.2f, 1.4f });
        Numerics<Float> floats2 = new Numerics<Float>(new Float[] { 2.1f, 3.2f, 1.4f });


        /** ___________________________________________________
         *
         *  этот метод не сработает с разными типами generic'ов
         *  ___________________________________________________
         */
        //average = floats.getSummandAverageFor(integers);

        /** _________________________
         *
         *  а этот успешно сработает!
         *  _________________________
         */
        average = floats.getSummandCorrectAverageFor(integers);

        out.println("The average for floats are: " + average);

        if(floats instanceof Numerics<?>) {
            // floats instanceof Numerics<Float> - неверно
            out.println("Оператор instanceof показывает, является ли переменная floats экземлпяром (или производной) от класса Numerics<?>");
        }
    }

    @Override
    public void run() throws Exception {
        simple();
    }
}
