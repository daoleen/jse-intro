package com.daoleen.javalearning.library.util.formatter;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */

import com.daoleen.javalearning.JavalearningRunnable;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

import static java.lang.System.out;

/**
 * Formatter создает форматированный вывод:
 *__________________________________________________________________________________________________________
 *                                                                                                          |
 * %a   - шестнадцатеричное с плавающей точкой                                                              |
 * %A   - заставляет 16-е цифры от a до f отображаться в верхнем регистре, т.е. [A-F],                      |
 *        также префикс 0x отображается как 0X, а p - как P                                                 |
 * %b   - булево                                                                                            |
 * %B   - переводит в верхний регистр значения true и false                                                 |
 * %c   - символ                                                                                            |
 * %d   - десятичное целое                                                                                  |
 * %h   - хеш-код аргумента                                                                                 |
 * %H   - 16-е цифры [a-f] в виде [A-F]                                                                     |
 * %e   - научная нотация                                                                                   |
 * %E   - символ экспоненты e в верхнем регистре                                                            |
 * %f   - десятичное с плавающей точкой                                                                     |
 * %g   - использует либо %e, либо %f, в зависимости от того, что короче                                    |
 * %G   - символ экспоненты e в верхнем регистре                                                            |
 * %o   - восьмеричное целое                                                                                |
 * %n   - вставляет символ перевода строки                                                                  |
 * %s   - строка                                                                                            |
 * %S   - переводит соответствующую спецификатору строку в верхний регистр                                  |
 *                                                                                                          |
 * %t   - время и дата                                                                                      |
 *      Этот спецификатор отличается от других тем, что здесь можно указывать суффиксы.                     |
 *      Аргументы, относящиеся к спецификатору %t, должны иметь тип Calendar,Date,Long или long.            |
 *      Пример написания аргумента: %tM - для отображения минут                                             |
 *      Список аргументов, ниже:                                                                            |
 *      a   - сокращенное название дня недели                                                               |
 *      A   - полное название дня недели                                                                    |
 *      b   - сокращенное название месяца                                                                   |
 *      B   - полное название месяца                                                                        |
 *      c   - стандартная строка даты и времени, отформатированная как:  день месяц дата чч:мм:сс пояс год  |
 *      C   - первые 2 знака года                                                                           |
 *      d   - день месяца как десятичное число (01-31)                                                      |
 *      D   - месяц/день/год                                                                                |
 *      e   - день месяца как десятичное число (1-31)                                                       |
 *      F   - год-месяц-день                                                                                |
 *      h   - сокращенное название месяца                                                                   |
 *      H   - часы (от 00 до 23)                                                                            |
 *      I   - часы (от 01 до 12)                                                                            |
 *      j   - день года как десятичное число (от 001 до 366)                                                |
 *      k   - часы (от 0 до 23)                                                                             |
 *      l   - часы (от 1 до 12)                                                                             |
 *      L   - миллисекунды (от 000 до 999)                                                                  |
 *      m   - месяц как десятичное число (от 01 до 13)                                                      |
 *      M   - минуты как десятичное число (от 00 до 59)                                                     |
 *      N   - наносекунды (от 000000000 до 999999999)                                                       |
 *      p   - локальный эквивалент AM или PM в нижмем регистре                                              |
 *      Q   - миллисекунды, прошедшие с 01/01/1970                                                          |
 *      r   - чч:мм (12-часовой формат)                                                                     |
 *      R   - чч:мм (24-часовой формат)                                                                     |
 *      S   - секунды (от 0 до 60)                                                                          |
 *      s   - секунды, прошедшие с 01/01/1970 UTC                                                           |
 *      T   - чч:мм:сс (24-часовой формат)                                                                  |
 *      y   - годы в десятичных числах без века (от 00 до 99)                                               |
 *      Y   - годы в десятичных числах включая век (от 0001 до 9999)                                        |
 *      z   - смещение от UTC                                                                               |
 *      Z   - наименования часового пояса                                                                   |
 * -----> пример: timeDateFormat()                                                                          |
 *                                                                                                          |
 * %T   - заставляет алфавитный вывод отображаться в верхнем регистре                                       |
 * %x   - шестнадцатеричное целое                                                                           |
 * %X   - заставляет 16-е цифры [a-f] отображаться как [A-F], а также 0x как 0X                             |
 * %%   - вставляет символ %                                                                                |
 *__________________________________________________________________________________________________________|
 *
 * Указание минимальной ширины поля.
 * Целое число, помещенное между символом % и кодом преобразования формата,
 * выступает в качестве спецификатора минимальной ширины, который дополняет
 * вывод пробелами, чтобы обеспечивать заданную минимальную длину.
 * Если строка или число получаются длиннее этого заданного минимума, они
 * будут напечатаны полностью. По умолчанию дополнение осуществляется пробелами,
 * однако ему нужно дополнять, например нулями, то следует поместить 0 перед
 * спецификатором ширины поля, например %05d - дополнит число, состоящие из
 * менее 5 разрядов нулями, - чтобы его общая ширина была равна 5.
 * Спецификатор ширины поля может применяться вместе со всеми спецификаторами
 * формата, кроме %n
 * -----> Пример: minimalLengthSpecificator()
 * _________________________________________________________________________________________________________
 *
 * Указание точности
 * Спецификатор точности может быть применим к спецификаторам формата %f,%e,%g и %s.
 * Он следует за спецификатором минимальной ширины поля (если таковой имеется) и состоит из
 * точки с последующим целым числом.
 * Когда применяется спецификатор точности к данным с плавающей точкой с использованием
 * спецификаторов преобразования %f или %e, то он определяет количество отображаемых десятичных
 * разрядов. Например, %10.4f отображает число, по меньшей мере, в 10 символов шириной с четырьмя
 * разрядами после запятой.
 * При использовании спецификатора %g точность определяет количесвто значащих десятичных разрядов. Точность
 * по умолчанию составляет 6 знаков после запятой.
 * В применении к строкам, спецификатор точности задает максимальную ширину поля. Например, %5.7s отображает
 * строку длиной минимум в 5 символов и не превышающей 7 символов. Если строка длинее максимальной ширины,
 * конечные символы будут усечены.
 *__________________________________________________________________________________________________________
 *
 * Использование флагов формата:
 * Класс Formatter распознает набор флагов формата, которые позволяют управлять различными аспектами
 * преобразования. Все флаги формата - одиночные символы и флаг формата следует за знаком % в спецификаторе.
 *
 * Флаги форматов:
 * ____________________________________________________
 *| -    - (дефис) выравнивание влево                  |
 *| #    - альтернативный формат преобразования        |
 *| 0    - вывод дополнятеся нулями вместоп пробелов   |
 *| пробел - положительным числам предшествует пробел  |
 *| +    - положительным числам прешествует знак "+"   |
 *| ,    - (запятая) числовые значения включающие      |
 *|        групповые разделители                       |
 *| (    - отрицательные числовые значения заключены в |
 *|        скобки                                      |
 *|____________________________________________________|
 *
 * Флаг `#` - может применяться к спецификаторам %o,%x,%e и %f.
 * Для спецификаторов %e и %f обеспечивает наличие десятичной точки даже в случае, если нет дробных разрядов
 * Для %x - шестнадцатеричное число будет выведено с префиксом 0x
 * Для %o - число будет выводиться с ведущим нулем
 *
 * -----> Пример: flagsSpecifiers()
 * _________________________________________________________________________________________________________
 *
 * Использование индексов аргументов
 * Formatter включает очень удобное средство, позволяющее указать аргумент, к которому должен применяться
 * конкретный спецификатор формата.
 * Записывается в виде:    n$  ,где n - индекс нужного аргумента, начиная с 1.
 * Пример:
 * --> formatter.format("%3$d %1$d %2$d", 10, 20, 30);
 * создаст строку
 * ---> 30 10 20
 * Один из преимуществ индексирования аргумента является то, что это позволяет повторно использовать
 * аргумент, не указывая его дважды.
 * Существует удобное сокращение, называемое относительным индексом, которое позволяет повторно использовать
 * аргументы, соостветствующие предшествующему спецификатору формата. Указывается `<` вместо индекса
 * аргумента. Например%
 * --> formatter.format("%d в шестнадцатеричном формате равно: %<x", 255);
 * создаст строку:
 * ---> 255 в шестнадцатеричном формате равно: ff
 * -----> Пример, показывающий удобную работу с датами: relativeAddressingSpecifier()
 */
public class FormatterLearning implements JavalearningRunnable {

    /**
     * Работа с форматом даты
     */
    private void timeDateFormat() {
        Calendar cal = Calendar.getInstance();
        Locale locale = new Locale.Builder().setLanguage("ru").build();
        out.println("Пример работы с датами:");

        try (Formatter formatter = new Formatter()) {
            // отображение стандартного 12-часового формата
            formatter.format("%tr", cal);
            out.println(formatter);
        }

        try (Formatter formatter = new Formatter()) {
            // отображение полной информации о дате и времени
            formatter.format(locale, "%tc", cal);
            out.println(formatter);
        }

        try (Formatter formatter = new Formatter()) {
            // отображение только часов и минут
            formatter.format("%tk:%tM", cal, cal);
            out.println(formatter);
        }

        try (Formatter formatter = new Formatter()) {
            // отображение названия и номера месяца
            formatter.format(locale, "%tB %tb %tm", cal, cal, cal);
            out.println(formatter);
        }
        out.println();
    }

    /**
     * Пример работы спецификатора минимальной длины
     */
    private void minimalLengthSpecificator() {
        out.println("Пример работы спецификатора минимальной длины");

        try(Formatter formatter = new Formatter()) {
            formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
            out.println(formatter);
        }
        out.println();
    }


    /**
     * Пример работы спецификатора точности
     */
    private void accuracySpecifier() {
        out.println("Пример работы спецификатора точности");

        try(Formatter formatter = new Formatter()) {
            formatter.format("%.4f", 123.1234567);
            out.println("123.1234567 are: " + formatter);
        }
        try(Formatter formatter = new Formatter()) {
            formatter.format("%16.2e", 123.1234567);
            out.println("123.1234567 are: " + formatter);
        }
        try(Formatter formatter = new Formatter()) {
            formatter.format("%.15s", "Форматировать в Java теперь очень просто");
            out.println("`Форматировать в Java теперь очень просто` are: " + formatter);
        }
        out.println();
    }


    private void flagsSpecifiers() {
        out.println("Пример работы флагов");

        out.println("пример выравнивания:");
        try(Formatter formatter = new Formatter()) {
            out.println("-по умолачанию:");
            formatter.format("|%10.2f|", 123.123);
            out.println("\t"+formatter);
        }
        try(Formatter formatter = new Formatter()) {
            out.println("-с флагом `дефис`:");
            formatter.format("\t|%-10.2f|", 123.123);
            out.println(formatter);
        }

        out.println("пример работы с числами - положительными, отрицательными:");
        try(Formatter formatter = new Formatter()) {
            out.println("{% d} для -100:");
            formatter.format("\t% d", -100);
            out.println(formatter);
        }
        try(Formatter formatter = new Formatter()) {
            out.println("{% d} для 100:");
            formatter.format("\t% d", 100);
            out.println(formatter);
        }
        try(Formatter formatter = new Formatter()) {
            out.println("{%(d} для -100:");
            formatter.format("\t%(d", -100);
            out.println(formatter);
        }
        out.println("пример работы с флагом `запятая`");
        try(Formatter formatter = new Formatter()) {
            out.println("{%,.2f} для 1234567.89:");
            formatter.format("\t%,.2f", 1234567.89);
            out.println(formatter);
        }
        out.println();
    }


    private void relativeAddressingSpecifier() {
        out.println("Этот пример отображает удобство при использовании относительной адресации в спецификаторах:");
        Calendar calendar = Calendar.getInstance();

        try(Formatter formatter = new Formatter()) {
            out.println("{Today is day %te of %<tB, %<tY} для объекта(одного параметра) Calendar:");
            formatter.format("\tToday is day %te of %<tB, %<tY", calendar);
            out.println(formatter);
        }
        out.println();
    }


    @Override
    public void run() throws Exception {
        timeDateFormat();
        minimalLengthSpecificator();
        accuracySpecifier();
        flagsSpecifiers();
        relativeAddressingSpecifier();
    }
}