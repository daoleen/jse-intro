package com.daoleen.javalearning.library.rmi;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 5:38 PM
 * To change this template use File | Settings | File Templates.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Здесь определяется дистанционный интерфейс, который будет предоставлен сервером.
 * Он содержит один метод, принимающий 2 параметра double, и возвращающий их сумму.
 * Все дистанционные интерфейсы должны расширять интерфейс Remote.
 * Все дистанционные методы могут передавать исключение RemoteException.
 */
public interface AddServerIntf extends Remote {
    double add(double add1, double add2) throws RemoteException;
}
