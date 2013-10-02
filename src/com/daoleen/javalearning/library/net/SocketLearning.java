package com.daoleen.javalearning.library.net;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Сокеты используются для установления надежного соединения передачи данных между двумя узлами.
 * В Java определены 2 класса работы с сокетами:
 * - Socket - клиентский класс для работы с сокетом
 * - ServerSocket - серверный класс для работы с сокетом
 */
public class SocketLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        try(Socket socket = new Socket("whois.internic.net", 43)) {
            int c;
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            String command = "google.com\n";
            byte commandBytes[] = command.getBytes();

            out.write(commandBytes);
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
