package com.daoleen.javalearning.library.util.currency;

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.Currency;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyLearning implements JavalearningRunnable {
    @Override
    public void run() throws Exception {
        Currency currency = Currency.getInstance(Locale.CHINA);
        System.out.println(currency.getSymbol() + " is a " + currency.getDisplayName());
    }
}
