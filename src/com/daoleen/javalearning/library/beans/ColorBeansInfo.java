package com.daoleen.javalearning.library.beans;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Класс ColorBeansInfo наследуется от SimpleBeanInfo и предоставляет явную
 * информацию о цвете. В нем переопределяется метод getPropertyDescriptors() для
 * указания того, какие свойства будут доступны пользователю компонента Java Beans.
 * В данном случае пользователю доступно только свойство rectangular.
 */
public class ColorBeansInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor pd[] = { rectangular };
            return pd;
        }
        catch (Exception e) {
            System.out.println("Передано исключение: " + e.getMessage());
        }
        return null;
    }
}
