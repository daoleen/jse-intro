package com.daoleen.javalearning.library.nio;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

/**
 * Path - интерфейс, декларирующий некоторые интересные и полезные методы,
 * например как путь к текущему каталогу - resolve...
 * Paths - класс, реализующий интерфейс Path
 */
public class PathLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        Path path = Paths.get(".").toRealPath();
        out.println("Путь к текущему каталогу: " + path);
        out.println("Путь к корневому каталогу: " + path.getRoot());
        out.println("Путь к родительскому каталогу: " + path.getParent());
    }
}
