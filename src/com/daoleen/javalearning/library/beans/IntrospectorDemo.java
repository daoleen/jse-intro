package com.daoleen.javalearning.library.beans;

import com.daoleen.javalearning.JavalearningRunnable;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */


/**
 * Класс IntrospectorDemo использует самодиагностику для отображения свойств
 * и событий, доступных в компонентe Java Beans Colors.
 */
public class IntrospectorDemo implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        Class<?> c = Colors.class;
        BeanInfo beanInfo = Introspector.getBeanInfo(c);

        out.println("Свойства: ");
        PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor pd : propertyDescriptor) {
            out.println("\t" + pd.getName());
        }

        out.println("События:");
        EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();
        for(EventSetDescriptor ed : eventSetDescriptor) {
            out.println("\t" + ed.getName());
        }
    }
}
