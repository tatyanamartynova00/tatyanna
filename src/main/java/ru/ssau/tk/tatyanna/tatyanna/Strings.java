package ru.ssau.tk.tatyanna.tatyanna;

import java.nio.charset.Charset;

public class Strings {
    public static void main(String[] args) {
        compareForEquality();
        CharacterEscaping();
    }

    static public char[] getEachSymbolOfString(String string) {
        char[] chars = new char[string.length()];
        for (int j = 0; j < string.length(); j++) {
            chars[j] = string.charAt(j);
            System.out.println(chars[j]);
        }
        return chars;
    }

    static public void printBytes(String string) {
        byte[] bytes = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(bytes[i]);
        }
    }

    static public void compareForEquality() {
        String firstString = " string for test";
        String secondString = new String(firstString);
        System.out.println(firstString == secondString);//false, т.к. == сравнивает ссылки
        System.out.println(firstString.equals(secondString)); //true, т.к. метод equals() сравнианиет значения
    }

    static public boolean checkPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void CharacterEscaping() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);  //символ табуляции=4 пробелам
        System.out.println("Символ\b№" + ++i);  //возврат в тексте на 1 шаг назад
        System.out.println("Символ\n№" + ++i);  //переход на новую строку
        System.out.println("Символ\r№" + ++i);  //возврат каретки
        System.out.println("Символ\'№" + ++i);  //символ одинарной кавычки
        System.out.println("Символ\"№" + ++i);  //символ двойной кавычки
        System.out.println("Символ\\№" + ++i); // символ обратной косой черты, если удалить один обратный слеш - ошибка: illegal escape character in string literal
    }

    public static int getIndexOfFirstEntry(String first, String second) {
        return first.indexOf(second);
    }

    public static int getIndexOfFirstEntryInSecondPartOfFirstString(String first, String second) {
        return first.indexOf(second, first.length() / 2);
    }

    public static int getIndexOfLastEntryInFirstPartOfFirstString(String first, String second) {
        return first.lastIndexOf(second, first.length() / 2);
    }

    public static int getNumberOfRowsThatSatisfyArguments(String[] strings, String prefix, String suffix) {
        int number = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(prefix) && strings[i].endsWith(suffix)) {
                number++;
            }
        }
        return number;
    }

    public static int getNumberOfRowsThatSatisfyArgumentsWithoutSpaces(String[] strings, String prefix, String suffix) {
        int number = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        return Strings.getNumberOfRowsThatSatisfyArguments(strings, prefix, suffix);
    }

    public static String replaceOccurrencesOf(String string, String regex, String replacement) {
        for (int i = 0; i < 100 && string.contains(regex); i++) {
            string = string.replaceAll(regex, replacement);
        }
        return string;
    }

    public static String getSubstring(String string, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > string.length()) {
            to = string.length();
        }
        if (to <= from) {
            return " ";
        }
        return string.substring(from, to);
    }

    public static String mergerOfStringsWithGap(String[] arrayOfStrings) {
        return String.join(", ", arrayOfStrings);
    }

    public static String printStringOfNumbers(int number) {
        StringBuilder builder = new StringBuilder();
        builder.append(0);
        for (int i = 1; i < number; i++) {
            builder.append(" ").append(i);
        }
        return builder.toString();
    }

    public static String replaceEvenSymbolAndFlipString(String string) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                builder.replace(i, i + 1, Integer.toString(i));
            }
        }
        return builder.reverse().toString();
    }

    public static String replaceCharset(String string, Charset firstCharset, Charset secondCharset) {
        byte[] bytes = string.getBytes(firstCharset);
        return new String(bytes, secondCharset);
    }

    public static String[] splitStringBySpaceCharacter(String string) {
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isEmpty()) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            }
        }
        return strings;
    }
}
