package com.daoleen.javalearning.library.rmi;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.rmi.Naming;

/**
 * Этот класс является клиентом, здесь реализуется клиентская сторона распределенного приложения.
 * Этому файлу требуется 3 аргумента командной строки:
 * - IP-адрес или Имя сервера
 * - второй и третий - это числа, которые необходимо суммировать
 * Приложение начинается с формирования строки, имеющую синтаксическую структуру адреса
 * URL. Этот адрес URL использует протокол rmi. Строка включает IP-адрес или имя сервера
 * и строку "AddServer". Затем программа вызывает метод lookup() класса Naming.
 * Этот метод принимает один параметр - адрес URL rmi, и возвращает ссылку на объект типа
 * AddServerIntf. Впоследствии всякий дистанционный вызов можно будет направлять этому объекту.
 * Затем программа отображает параметры и вызывает дистанционный метод add(), который возвращает
 * результат суммирования, выводимый на экран.
 */
public class AddClient implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        double d1 = 12.13, d2 = 32.12;  // summ = 44.25
        String addServerUrl = "rmi://localhost/AddServer";
        AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerUrl);
        System.out.println("Первое число: " + d1);
        System.out.println("Второе число: " + d2);
        System.out.println("Сумма от сервера RMI: " + addServerIntf.add(d1, d2));
    }
}
