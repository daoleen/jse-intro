package com.daoleen.javalearning.library.util.scanner;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Класс Scanner предоствляет удобные методы для чтения данных с потокового ввода,
 * это может быть файл, консоль или другой поток.
 * Scanner определяет такие удобные методы, как на примере.
 * Также scanner умеет неплохо работать с регулярными выражениями, что также
 * видно на примере
 * А методы
 * - useDelimiter(String template)
 * - useDelimiter(Pattern template)
 * позволяют указать разделители. По умолчанию разделитель - ПРОБЕЛ.
 */
public class ScannerLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Вводите данные.. для завершения введите exit");
            while(scanner.hasNext()) {
                if(scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    System.out.println("Integer: " + value);
                }
                else if(scanner.hasNextFloat()) {
                    float value = scanner.nextFloat();
                    System.out.println("Float: " + value);
                }
                else{
                    String value = scanner.next();
                    System.out.println("String: " + value);
                    if(value.equalsIgnoreCase("exit")) {
                        break;
                    }
                }
            }

            System.out.println();
            System.out.println("Теперь попробуем прочитать из регулярного выражения");
            System.out.println("Читаем формат \\[0-9]{1}[a-z]*[0-9]{2}\\i");
            System.out.print("Введите выражение сюда: ");

            if(scanner.hasNext()) {
                try{
                    String result = scanner.next("[0-9]{1}[a-z]*[0-9]{2}");
                    System.out.println("Выражение совпало: " + result);
                } catch (NoSuchElementException noSuchElementException) {
                    System.out.println("Совпадений не найдено");
                }
            }
        }
    }
}
