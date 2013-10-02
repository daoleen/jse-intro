package com.daoleen.javalearning.annotations;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */

import java.lang.annotation.*;

/**
 * Класс, описывающий аннотацию
 * Начинается с @ затем interface, может быть public @interface
 * Неявно реализует интерфейс Annotation
 *
 * @RetentionPolicy - политика удержания аннотации, - это время доступности аннотации:
 * - RetentionPolicy.SOURCE - только в исходном файле и отбрасываются при компиляции
 * - RetentionPolicy.CLASS  - сохраняются в файлы .class при компиляции, однако недоступны JVM в runtime
 * - RetentionPolicy.RUNTIME - доступны JVM во время выполнения
 *
 * @Target - показывает, к какому типу может быть применена аннотация - полю, методу, классу, пакету и пр...
 *
 * @Inherited - показывает, что если аннотирован родительский класс, то и аннотация будет унаследована дочерним
 *
 * @Deprecated - показывает что объявление устарело
 *
 * @SuppressWarnings("Warning") - указывает, какие предупреждения комплилятора следует подавить
 *
 * @SafeVarargs - эта аннотация применима только к методам и конструкторам. Указывает, что никакие небезопасные
 * действия, связанные с параметром переменного количества аргументов, недопустимы. Она используется для
 * подавления неотмеченных предупреждений в остальном безопасном коде относительно нессылочных типов с
 * переменным количеством аргументов и параметрическим созданием экземпляра массива.
 * Применяется только к методам или конструкторам с переменным количеством аргументов, которые
 * объявлены как static или final
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited
@Deprecated
@interface MyAnnotation {
    int id() default 12;    // выглядит как метод. default - значение по умолчанию (тогда его можно не указывать)
    String name();          // но записывается как поле, т.е. не getName() а name()
}
