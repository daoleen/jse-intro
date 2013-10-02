package com.daoleen.javalearning.library.io;

import com.daoleen.javalearning.JavalearningRunnable;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileOutputStreamLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        String string = "Эта строка будет в дальнейшем записана в файл\n" +
                "Записываться будет с помощью класса FileOutputStream\n" +
                "Это значит что в бинарный файл!";

        try(FileOutputStream stream = new FileOutputStream("FileOutputStreamAppendTest.txt", true)) {
            byte bytes[] = string.getBytes();
            stream.write(bytes);
        }
        catch (IOException ioException) {
            System.out.println("IOException: " + ioException.getMessage());
        }
    }
}
