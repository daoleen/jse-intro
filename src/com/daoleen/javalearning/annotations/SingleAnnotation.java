package com.daoleen.javalearning.annotations;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Это пример простой аннотации
 * Т.е. аннотации, содержащей только один член
 * Метод, аннотированный такой аннотацией, может аннотироваться в простой форме
 * Но для этого в определении аннотации, имя такого члена должно быть value()
 */
@interface SingleAnnotation {
    double value();
}
