package ru.ssau.tk.tatyanna.tatyanna;

public class TangentOperation extends Operation {
    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}