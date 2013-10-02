package com.daoleen.javalearning;

import com.daoleen.javalearning.library.beans.IntrospectorDemo;
import com.daoleen.javalearning.library.net.SocketLearning;
import com.daoleen.javalearning.library.rmi.AddClient;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/25/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaLearning {
    public static void main(String[] args) throws Exception {
        //(new AnnotationRun()).run();
        //(new GenericRun()).run();

        //(new HashSetLearning()).run();
        //(new LinkedHashSetLearning()).run();
        //(new TreeSetLearning()).run();
        //(new IteratorLearning()).run();
        //(new ComparatorLearning()).run();

        //(new ObserverLearning()).run();     // реализация наблюдаемого-наблюдателя
        //(new MyTimerTask()).run();
        //(new CurrencyLearning()).run();
        //(new FormatterLearning()).run();
        //(new ScannerLearning()).run();
        //(new InternationalizationLearning()).run();

        //(new FileInputStreamLearning()).run();
        //(new FileOutputStreamLearning()).run();
        //(new BufferedInputStreamLearning()).run();
        //(new SerializeLearning()).run();

        //(new PathLearning()).run();

        //(new SocketLearning()).run();

        /// RMI:
        //(new AddClient()).run();

        /// Java Beans:
        (new IntrospectorDemo()).run();

    }
}
