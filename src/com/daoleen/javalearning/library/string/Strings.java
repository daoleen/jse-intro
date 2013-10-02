package com.daoleen.javalearning.library.string;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/26/13
 * Time: 12:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Strings {
    public void initialization() {
        String string;

        // создание строки из массива char'ов
        char[] chars = { 'a', 'b', 'c', 'e', 'k' };
        string = new String(chars);

        // созание строки из символов, начиная со 2й буквы, строка из 2х следующих букв
        // т.е. создается строка "ce"
        string = new String(chars, 2, 2);

        // создание строки из имеющейся строки
        string = new String(string);

        // Также есть еще 2 аналогичных конструктора, для работы с
        // символами 8 бит, т.е. байтовыми символами, распространенными в интернете ASCII
        // В кажом из этих конструктором преобразование байтов в символы выполняется в
        // соответствии с кодировкой по умолчанию для конкретной платформы
        // Существуют также расширенные конструкторы, принимающие байты ascii и желаемую кодировку
        // -> String(byte asciiSymbols[])
        // -> String(byte asciiSymbols[], int start, int length)
        byte ascii[] = {66, 67, 68, 69, 70};
        string = new String(ascii);


        // Другие интересные конструкторы:
        // -> String(StringBuffer buffer)
        // -> String(StringBuilder builder)
        // --
        // codePoints - массив, содержащий символы Unicode
        // -> String(int codePoints[], int start, int length)
    }


    public void getChars() {
        char ch;
        char chars[];
        String string = "Тестовая строка";
        int index = 0;

        ch = string.charAt(index);      // "Т"

        // Чтение нескольких символов из строки:
        // - [startSource;endSource) - начальная и конечная позиции для чтения
        // - goal[] - символьный массив-приемник
        // - startGoal - позиция в приемнике, куда записать символы
        // -> getChars(int startSource, int endSource, char goal[], int startGoal)
        int start = 4;
        int end = 8;
        chars = new char[end - start];
        string.getChars(start, end, chars, index);  // Результат: "овая"


        // получение байтов, как пример, для передачи по интернету
        // есть перегруженные версии, которые позволяют указать кодировку
        byte stringBytes[] = string.getBytes();

        chars = string.toCharArray();
    }


    public void stringCompare() {
        String string = "Тестовая строка";

        string.equals("тестовая строка");   // сравнение строк с учетом регистра. результат - false
        string.equalsIgnoreCase("тестовая строка"); // сравнения строк без регистра. результат - true


        // Сравнение строк со смещением:
        // - ignoreCase - учитывать ли регистр
        // - start - начальный индекс диапазона вызывающей строки
        // - string2 - строка для сравнения
        // - start2 - начальный индекс для string2
        // - charsCount - длина сравниваемой подстроки
        // -> boolean regionMatches(boolean ignoreCase, int start, String string2, int start2, int charsCount)
        string.regionMatches(true, 2, "тесто", 2, 3);
        string.regionMatches(2, "тесто", 2, 3); // overloaded


        "Foobar".endsWith("bar");   // true
        "Foobar".startsWith("Foo"); // true
        "Foobar".startsWith("oba", 2); // true

        // строки также можно сравнивать при помощи compareTo(..)

        /**
         * Класс String предлагает 2 метода, которые позволяют выполнять поиск
         * в строке определенного символа или подстроки:
         * -> int indexOf(..) - ищет первое вхождение символа или подстроки
         * -> int lastIndexOf(..) - последнее вхождение символа или подстроки
         */

        /**
         * substring(..) - извлечение подстроки
         * -> String substring(int start)
         * -> String substring(int start, int end)
         */
    }


    public void stringModification() {
        String string = "Тестовая строка";

        String s2 = string.concat(" #1");   // конкатенация

        string = string.replace('с', 'о');  // замена символа 'c' на символ 'о'
        string = string.replaceAll("#^[a-z]$#", "замена");    // замена на основе регулярного выражения
        string = string.trim();             // удаление пробелов с начала и конца строки
        string.toLowerCase().toUpperCase(); // работа с регистром
    }


    /**
     * Работа с объектом класса StringBudder
     * StringBuffer позволяет модифицировать строки, при этом
     * строки будут на самом деле изменяться, а не создаваться их копии
     */
    public void stringBuffer() {
        StringBuffer buffer = new StringBuffer("Есть еще перегруженные конструкторы");
        int length = buffer.length();       // длина строки в буфере
        int capacity = buffer.capacity();   // объем занимаемой памяти
        buffer.ensureCapacity(32);          // установка объема буфера (памяти) - указывается мин. размер, может быть больше
        buffer.setLength(27);               // установка длины строки
        buffer.append(new char[] { 'с', 's', 'r' });    // добавление символов, строк, других типов к буферу
        buffer.insert(15, "string");        // вставляет "string" на 15ю позицию
        buffer.reverse();                   // меняет порядок символов на обратный

        /// и другие методы подобные методам String
    }

    /**
     * StringBuilder - это аналог класса StringBuffer
     * Единственное отличие - это то что StringBuilder не синхронизирован,
     * т.е. не является безопасным в отношении потоков
     * А в однопоточной среде может быть более производителен!
     */
    public void stringBuilder(){}
}
