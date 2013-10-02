package com.daoleen.javalearning.generic;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Numerics<T extends Number> {
    private T[] data;

    public final T[] getData() {
        return data;
    }

    public Numerics(T[] data) {
        this.data = data;
    }

    public double getAverage(){
        double sum = 0.0;

        for(T element : data) {
            sum += element.doubleValue();
        }

        return sum / data.length;
    }


    /**
     * Эта версия сработает лишь в том случае, если
     * generic-параметры типов будут одинаковы!
     * <![CDATA[
     * Например:
     * - текущий объект this имеет тип Numerics<Integer>
     * - и объект параметра data2 имеет тип Numerics<Integer>
     * Если же:
     * - текущий объект this имеет тип Numerics<Integer>
     * - и объект параметра data2 имеет тип Numerics<Float>
     * -- т.е. разные типы generic'a, - то будет exception, т.к. в данном случае
     * -- в data (т.е. в this) лежит Numerics<Float>
     * -- а в data2(который передается в параметре) имеется ввиду тип Numercis<Integer> !!!
     * -- поэтому на таких данных этот метод не сработает!
     * ]]>
     */
    public double getSummandAverageFor(Numerics<T> data2) {
        double sum = 0.0;

        for(T element : data) {
            sum += element.doubleValue();
        }

        sum += data2.getAverage();

        return sum / data.length;
    }


    /**
     * Зато этот прекрасно сработает!
     * Т.к. в параметре передается шалон
     * Где указывается, что тип заранее не известен
     */
    public double getSummandCorrectAverageFor(Numerics<? extends Number> data2) {
        double sum = 0.0;

        for(T element : data) {
            sum += element.doubleValue();
        }

        sum += data2.getAverage();

        return sum / data.length;
    }


    /**
     * Здесь после public указывается допускаемый тип N для второго параметра x
     * А для параметра doubles указывается ограничивающий тип Numerics<? super Double>,
     * где ключевое слово super показывает, что Double - это НИЖНЯЯ граница (не включая!!!)
     */
    public <N extends Number> void getSum(Numerics<? super Double> doubles, N x) {
    }
}
