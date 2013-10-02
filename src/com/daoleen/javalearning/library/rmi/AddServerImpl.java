package com.daoleen.javalearning.library.rmi;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Здесь реализуется дистанционный интерфейс AddServerImpl, т.е. реализуется
 * метод add(..).
 * Дистанционные объекты обычно расширяют класс UnicastRemoteObject, который
 * обеспечивает функциональные возможности, необходимые для того, чтобы сделать
 * доступными объекты для дистанционных компьютеров.
 */
public class AddServerImpl extends UnicastRemoteObject
implements AddServerIntf {
    protected AddServerImpl() throws RemoteException {
    }

    @Override
    public double add(double add1, double add2) throws RemoteException {
        return add1 + add2;
    }
}
