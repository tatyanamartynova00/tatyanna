package ru.ssau.tk.tatyanna.tatyanna;

public class Matrices {
    public static Matrix summation(Matrix firstMatrix, Matrix secondMatrix) {
        int firstN = firstMatrix.getN();
        int firstM = firstMatrix.getM();
        int secondN = secondMatrix.getN();
        int secondM = secondMatrix.getM();
        if (firstN != secondN || firstM != secondM) {
            return null;
        } else {
            Matrix resultMatrix = new Matrix(firstN, firstM);
            for (int i = 0; i < firstN; i++) {
                for (int j = 0; j < firstM; j++) {
                    resultMatrix.setAt(i + 1, j + 1, firstMatrix.getAt(i + 1, j + 1) + secondMatrix.getAt(i + 1, j + 1));
                }
            }
            return resultMatrix;
        }

    }

    public static Matrix multiplication(Matrix matrixFirst, Matrix matrixSecond) {
        int firstN = matrixFirst.getN();
        int firstM = matrixFirst.getM();
        int secondN = matrixSecond.getN();
        int secondM = matrixSecond.getM();
        if (firstM != secondN) {
            return null;
        } else {
            Matrix resultMatrix = new Matrix(firstN, secondM);
            for (int i = 0; i < firstN; i++) {
                for (int j = 0; j < secondM; j++) {
                    for (int k = 0; k < firstM; k++) {
                        resultMatrix.setAt(i + 1, j + 1, resultMatrix.getAt(i + 1, j + 1) + matrixFirst.getAt(i + 1, k + 1) * matrixSecond.getAt(k + 1, j + 1));
                    }
                }
            }
            return resultMatrix;
        }
    }
}

