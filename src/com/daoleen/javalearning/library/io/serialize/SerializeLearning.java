package com.daoleen.javalearning.library.io.serialize;

import com.daoleen.javalearning.JavalearningRunnable;

import java.io.*;
import java.nio.file.Paths;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerializeLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        String path = Paths.get(".").toRealPath().toString().concat("/src/com/daoleen/javalearning/library/io/serialize/student.dat");
        System.out.println("Path of students database are: " + path);

        // Serialization
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(path))) {
            Student student = new Student("Alex", 385, 6.3f);
            System.out.printf("Student `%s` from %d group has own average ball are about '%5.2f'",
                    student.getName(), student.getGroup(), student.getAverageBall());
            objectOutputStream.writeObject(student);
            System.out.println("Serialization done...");
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // Deserialization
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(Paths.get(path).toRealPath().toString()))) {
            Student Alex = (Student) objectInputStream.readObject();
            System.out.println("Deserialization done...");
            System.out.printf("Student `%s` from %d group has own average ball are about '%5.2f'",
                    Alex.getName(), Alex.getGroup(), Alex.getAverageBall());
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
