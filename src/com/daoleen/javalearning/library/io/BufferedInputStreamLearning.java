package com.daoleen.javalearning.library.io;

import com.daoleen.javalearning.JavalearningRunnable;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Класс BufferedInputStream предназначен для оптимизации производительности. Он позволяет
 * заключить в оболочку любой поток класса InputStream и достичь увеличения производительности
 * (засчет использования буффера, т.е. из потока мы будем читать не по одному байту, а по
 * несколько байт).
 * Класс BufferedInputStream имеет 2 конструктора:
 * - BufferedInputStream(InputStream inputStream)
 * - BufferedInputStream(InputStream inputStream, int bufferSize)
 * Первая форма создает буфферизированный поток, используя размер буффера по умолчанию.
 * Во второй форме размер буффера указывается явно. Рекомендуется использовать размеры буффера,
 * кратные размеру страницы памяти, дисковому блоку и т.п, - это окажет существенное положительное
 * влияние на производительность. Было бы неплохо установить буффер для потока ввода-вывода
 * в 8192 байт или даже меньше.
 */
public class BufferedInputStreamLearning implements JavalearningRunnable {
    /**
     * Пример, в котором используется метод mark() для запоминания места во входном потоке, чтобы
     * позднее вернуться к нему с помощью метода reset().
     * Этот пример разбирает поток, находя в нем конструкцию HTML, указывающую на символ копирайта
     * (&copy;).
     * @throws Exception
     */
    @Override
    public void run() throws Exception {
        String s = "This is a &copy; copyright symbol "
                + "but this is &copy not\n";
        byte buff[] = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        int c;
        boolean marked = false;

        try(BufferedInputStream bufferedStream = new BufferedInputStream(in)) {
            while ((c = bufferedStream.read()) != -1) {
                switch (c) {
                    case 'c':
                        if(!marked) {
                            bufferedStream.mark(32);    // помечаем 32 байта, что должно быть достаточно для &copy;
                            marked = true;
                        }
                        else {
                            marked = false;
                        }
                        break;

                    case ';':
                        if(marked) {
                            marked = false;
                            System.out.println("(c)");  // найден копирайт
                        }
                        else {
                            System.out.print((char)c);
                        }
                        break;

                    case ' ':
                        if(marked) {
                            marked = false;
                            bufferedStream.reset();
                            System.out.print('&');
                        } else {
                            System.out.print((char) c);
                        }
                        break;

                    default:
                        if(!marked) {
                            System.out.print((char)c);
                        }
                        break;
                }
            }
        }
        catch (IOException ioException) {
            System.out.println("IOException: " + ioException.getMessage());
        }
    }
}
