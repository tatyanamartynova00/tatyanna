package ru.ssau.tk.tatyanna.tatyanna;

public class Matrix {
    private double[][] matrix;
    private final int n;
    private final int m;


    Matrix(int countRow, int countColumn) {
        this.n = countRow;
        this.m = countColumn;
        this.matrix = new double[countRow][countColumn];
    }
    Matrix(double[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        this.matrix = matrix;
    }

    void setAt(int n, int m, double number) {
        matrix[n - 1][m - 1] = number;
    }

    double getAt(int n, int m) {
        return matrix[n - 1][m - 1];
    }

    int getN() {
        return n;
    }

    int getM() {
        return m;
    }
}
