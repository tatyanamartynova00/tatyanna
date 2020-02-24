package ru.ssau.tk.tatyanna.tatyanna;

public class Types {

    static void printType(byte argument) {
        System.out.println("byte");
    }

    static void printType(char argument) {
        System.out.println("char");
    }

    static void printType(short argument) {
        System.out.println("short");
    }

    static void printType(int argument) {
        System.out.println("int");
    }

    static void printType(long argument) {
        System.out.println("long");
    }

    static void printType(float argument) {
        System.out.println("float");
    }

    static void printType(double argument) {
        System.out.println("double");
    }

    static void printType(boolean argument) {
        System.out.println("boolean");
    }

    static void printType(Object argument) {
        if (argument == null) {
            System.out.println("null");
        } else {
            System.out.println(argument.getClass().getSimpleName());
        }
    }


}
