package ru.ssau.tk.tatyanna.tatyanna;

abstract class Operation {
    abstract double apply(double number);

    double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}

