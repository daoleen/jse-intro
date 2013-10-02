package com.daoleen.javalearning.library.rmi;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.rmi.Naming;

/**
 * Этот класс содержит главную программу для компьютера-сервера.
 * Его главная задача - обновлять реестр RMI на этом компьютере.
 * Это делается с помощью метода rebind() класса Naming. Этот метод связывает
 * имя со ссылкой на объект. Первым параметром метода rebind() является строка,
 * которая присваивает серверу имя "AddServer". Его второй параметр является
 * ссылкой на AddServerImpl
 *
 * При тестировании нужно запустить сервер (в разных потоках):
 * $ rmiregistry
 * $ java com.daoleen.javalearning.library.rmi.AddServer
 */
public class AddServer {
    public static void main(String args[]) {
        try {
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
