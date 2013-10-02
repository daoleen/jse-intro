package com.daoleen.javalearning.library.util.internationalization_genericPackage;

import java.util.ListResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class SampleRB_de extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        Object resources[][] = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "Mein Programm";

        resources[1][0] = "stopText";
        resources[1][1] = "Anschlag";

        resources[2][0] = "startText";
        resources[2][1] = "Anfang";

        return resources;
    }
}
