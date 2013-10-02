package com.daoleen.javalearning.annotations;

import com.daoleen.javalearning.JavalearningRunnable;
import sun.reflect.annotation.AnnotationType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationRun implements JavalearningRunnable {
    /**
     * Аннотированный метод
     * В аннотации явно указывается параметр name,
     * и неявно определяется параметр id = 12
     * @param x
     */
    @MyAnnotation(name = "Its annotation with id, that value is 27")
    public void annotatedMethod(int x) {
        out.println(x);
    }


    /**
     * Здесь необходим RetentionPolicy.RUNTIME, т.е.
     * получаем данные об аннотации с помощью рефлексии, т.е. во время выполнения
     * Этот метод также аннотирован простой аннотацией с помощью сокращенной формы записи
     */
    @SingleAnnotation(125.32)
    void printAnnotationDataByReflection() throws Exception {
        Class<?> annotationRunClass = (new AnnotationRun()).getClass();
        Method annotatedMethodM;

        // The annotationMethod must have a public identifier for successful reflection
        annotatedMethodM = annotationRunClass.getMethod("annotatedMethod", int.class);

        Annotation[] annotations = annotatedMethodM.getAnnotations();

        for(Annotation annotation : annotations) {
            out.println(annotation);
            out.println("Methods in this annotation are:");
            Method methods[] = annotation.getClass().getDeclaredMethods();           // getDeclaredMethods() обозначает, что будем читать
                                                                                     // только объявленные в этом классе методы,
                                                                                     // исключая унаследованные.

            for(Method method : methods) {
                if(!method.getName().equals("equals")) {
                    out.println("Trying to execute a method with name " + method.getName());
                    out.println(method.invoke(annotation));
                }
            }
        }
    }


    @Override
    public void run() throws Exception {
        out.println("Calling an annotated method...");
        annotatedMethod(25);
        printAnnotationDataByReflection();
    }
}
