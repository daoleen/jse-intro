package com.daoleen.javalearning.library.io;

import com.daoleen.javalearning.JavalearningRunnable;
import static java.lang.System.out;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileInputStreamLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        int size;

        try(FileInputStream f = new FileInputStream("/home/daoleen/Java/Learning/src/com/daoleen/javalearning/library/io/FileInputStreamLearning.java")) {
            size = f.available();
            out.println("Total available bytes: " + size);

            int n = size / 40;
            out.println("First " + n + " bytes of the file one read() at a time");
            for(int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            out.println("Still available: " + f.available());
            out.println("Reading the next " + n + " bytes with one read(b[])");
            byte b[] = new byte[n];
            if(f.read(b) != n) {
                System.err.println("Couldn't read " + n + " bytes");
            }

            out.println(new String(b, 0, n));
            out.println("\nStill available: " + (size = f.available()));
            out.println("Skipping half of remaining bytes with skip()");
            f.skip(size/2);
            out.println("Still available: " + f.available());
            out.println("Reading " + n/2 + " into the end of array");

            if(f.read(b, n/2, n/2) != n/2) {
                System.err.println("couldn't read " + n/2 + " bytes");
            }

            out.println(new String(b, 0, b.length));
            out.println("Still available: " + f.available());
        }
        catch (IOException exception) {
            out.println("I/O Exception: " + exception.getMessage());
        }
    }
}
