package com.daoleen.javalearning.library.util.internationalization_genericPackage;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;
import static java.lang.System.out;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * В пакете java.util.* находятся 3 важных для интернационализации класса:
 * - абстрактный ResourceBundle
 * - абстрактный ListResourceBundle extends ResourceBundle
 * - PropertyResourceBundle         extends ResourceBundle
 */
public class InternationalizationLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        // Связка по умолчанию
        ResourceBundle rb = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        out.println("Немецкая версия:");
        out.println("Title: " + rb.getString("title"));
        out.println("startText: " + rb.getString("startText"));
        out.println("stopText: " + rb.getString("stopText"));
    }
}
