package com.daoleen.javalearning.library.util.collection;

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListLearning implements JavalearningRunnable {
    private ArrayList<Integer> list;

    public ArrayListLearning() {
        list = new ArrayList<Integer>();
    }

    public void add(int item) {
        list.add(item);
    }

    public void add(int position, int item) {
        list.add(position, item);
    }

    public void delete(int item) {
        list.remove(item);
    }

    public void delete(List<? extends Integer> items) {
        list.removeAll(items);
    }

    public void removeScalar() {
        list.remove(new Integer(2));
    }

    /**
     * Удаляет все элементы из коллекции,
     * за исключением items
     * @param items
     */
    public void retain(Collection<? extends Integer> items) {
        list.retainAll(items);
    }


    /**
     * Приводит к <T> toArray(T[] coll)
     * @return
     */
    public Integer[] getIntegerArray() {
        Integer[] result = new Integer[list.size()];
        return list.toArray(result);
    }

    @Override
    public void run() throws Exception {
        add(1);
        add(0, 4);
        Integer[] elements = getIntegerArray();
        removeScalar();
        delete(0);
    }
}
