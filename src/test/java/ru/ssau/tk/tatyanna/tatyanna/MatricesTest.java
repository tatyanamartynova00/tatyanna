package ru.ssau.tk.tatyanna.tatyanna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatricesTest {

    @Test
    public void testSummation() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(1, 1, 10);
        firstMatrix.setAt(1, 2, -10);
        firstMatrix.setAt(2, 1, 20);
        firstMatrix.setAt(2, 2, -20);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.setAt(1, 1, 1);
        secondMatrix.setAt(1, 2, 2);
        secondMatrix.setAt(2, 1, 3);
        secondMatrix.setAt(2, 2, 4);
        Matrix thirdMatrix = new Matrix(3, 2);
        thirdMatrix.setAt(1, 1, 10);
        thirdMatrix.setAt(1, 2, 2);
        thirdMatrix.setAt(2, 1, 30);
        thirdMatrix.setAt(2, 2, 40);
        thirdMatrix.setAt(3, 1, 50);
        thirdMatrix.setAt(3, 2, 60);
        Matrix resultMatrix = Matrices.summation(firstMatrix, secondMatrix);
        assertEquals(resultMatrix.getAt(1, 1), 11.0);
        assertEquals(resultMatrix.getAt(1, 2), -8.0);
        assertEquals(resultMatrix.getAt(2, 1), 23.0);
        assertEquals(resultMatrix.getAt(2, 2), -16.0);
        assertNull(Matrices.summation(firstMatrix, thirdMatrix));
    }

    @Test
    public void testMultiplication() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(1, 1, 10);
        firstMatrix.setAt(1, 2, -10);
        firstMatrix.setAt(2, 1, 20);
        firstMatrix.setAt(2, 2, -20);
        Matrix secondMatrix = new Matrix(2, 2);
        secondMatrix.setAt(1, 1, 1);
        secondMatrix.setAt(1, 2, 2);
        secondMatrix.setAt(2, 1, 3);
        secondMatrix.setAt(2, 2, 4);
        Matrix thirdMatrix = new Matrix(3, 2);
        thirdMatrix.setAt(1, 1, 10);
        thirdMatrix.setAt(1, 2, 20);
        thirdMatrix.setAt(2, 1, 30);
        thirdMatrix.setAt(2, 2, 40);
        thirdMatrix.setAt(3, 1, 50);
        thirdMatrix.setAt(3, 2, 60);
        Matrix forthMatrix = new Matrix(2, 3);
        forthMatrix.setAt(1, 1, 10);
        forthMatrix.setAt(1, 2, 20);
        forthMatrix.setAt(1, 3, 30);
        forthMatrix.setAt(2, 1, 40);
        forthMatrix.setAt(2, 2, 50);
        forthMatrix.setAt(2, 3, 60);
        Matrix resultMatrix = Matrices.multiplication(firstMatrix, secondMatrix);
        assertEquals(resultMatrix.getAt(1, 1), -20.0);
        assertEquals(resultMatrix.getAt(1, 2), -20.0);
        assertEquals(resultMatrix.getAt(2, 1), -40.0);
        assertEquals(resultMatrix.getAt(2, 2), -40.0);
        Matrix secondResultMatrix = Matrices.multiplication(firstMatrix, forthMatrix);
        assertEquals(secondResultMatrix.getAt(1, 1), -300.0);
        assertEquals(secondResultMatrix.getAt(1, 2), -300.0);
        assertEquals(secondResultMatrix.getAt(1, 3), -300.0);
        assertEquals(secondResultMatrix.getAt(2, 1), -600.0);
        assertEquals(secondResultMatrix.getAt(2, 2), -600.0);
        assertEquals(secondResultMatrix.getAt(2, 3), -600.0);
        assertNull(Matrices.multiplication(firstMatrix, thirdMatrix));
    }
}
