package ru.ssau.tk.tatyanna.tatyanna;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void testCreateArray() {
        assertEquals(Array.createArray(3)[2], 3.0);
        assertEquals(Array.createArray(1)[0], 1.0);
    }

    @Test
    public void testCreateArrayOneTwo() {
        assertEquals(Array.createArrayOneTwo(3)[2], 2.0);
        assertEquals(Array.createArrayOneTwo(3)[0], 2.0);
        assertEquals(Array.createArrayOneTwo(3)[1], 1.0);

    }

    @Test
    public void testCreateOddArray() {
        assertEquals(Array.createOddArray(5)[4], 9.0);
        assertEquals(Array.createOddArray(2)[1], 3.0);
        assertEquals(Array.createOddArray(1)[0], 1.0);
    }

    @Test
    public void testCreateEvenArray() {
        assertEquals(Array.createEvenArray(5)[0], 2.0);
        assertEquals(Array.createEvenArray(2)[1], 4.0);
        assertEquals(Array.createEvenArray(3)[2], 6.0);
    }

    @Test
    public void testCreateFibonacciArray() {
        assertEquals(Array.createFibonacciArray(3)[0], 1.0);
        assertEquals(Array.createFibonacciArray(5)[3], 3.0);
        assertEquals(Array.createFibonacciArray(3)[2], 2.0);
    }

    @Test
    public void testSquareIndexArray() {
        assertEquals(Array.createSquareIndexArray(1)[0], 0.0);
        assertEquals(Array.createSquareIndexArray(5)[3], 9.0);
        assertEquals(Array.createSquareIndexArray(3)[2], 4.0);
    }

    @Test
    public void testSolutionsOfSquareEquation() {
        double accuracy = 0.00001;
        double[] firstSolutionOfSquareEquation = Array.solutionsOfSquareEquation(1, -2, -3);
        assertEquals(firstSolutionOfSquareEquation[0], -1, accuracy);
        assertEquals(firstSolutionOfSquareEquation[1], 3, accuracy);
        double[] secondSolutionOfSquareEquation = Array.solutionsOfSquareEquation(0, -2, -5);
        assertEquals(secondSolutionOfSquareEquation[0], -5.0 / 2, accuracy);
        assertEquals(Array.solutionsOfSquareEquation(0, 0, 5).length, 0);
        double[] thirdSolutionOfSquareEquation = Array.solutionsOfSquareEquation(-9, 6, -1);
        assertEquals(thirdSolutionOfSquareEquation[0], 1.0 / 3, accuracy);
        assertEquals(Array.solutionsOfSquareEquation(7, -1, 2).length, 0);
    }

    @Test
    public void testNumbersAreNotDivisibleByThree() {
        double[] firstNumberAreNotDivisibleByThree = Array.numbersAreNotDivisibleByThree(4);
        assertEquals(firstNumberAreNotDivisibleByThree[0], 1.0);
        assertEquals(firstNumberAreNotDivisibleByThree[1], 2.0);
        assertEquals(firstNumberAreNotDivisibleByThree[2], 4.0);
    }

    @Test
    public void testArithmeticProgression() {
        double[] firstArithmeticProgression = Array.arithmeticProgression(4, -1, 3);
        assertEquals(firstArithmeticProgression[0], 4.0);
        assertEquals(firstArithmeticProgression[1], 3.0);
        assertEquals(firstArithmeticProgression[2], 2.0);
    }

    @Test
    public void testGeometricProgression() {
        double accuracy = 0.00001;
        double[] array = Array.geometricProgression(2, -3, 4);
        assertEquals(array[0], 2.0, accuracy);
        assertEquals(array[1], -6.0, accuracy);
        assertEquals(array[2], 18.0, accuracy);
        assertEquals(array[3], -54.0, accuracy);
    }

    @Test
    public void testSymmetricalArray() {
        double accuracy = 0.00001;
        double[] array = Array.symmetricalArray(5);
        assertEquals(array[0], 1, accuracy);
        assertEquals(array[1], 2, accuracy);
        assertEquals(array[2], 3, accuracy);
        assertEquals(array[3], 2, accuracy);
        assertEquals(array[4], 1, accuracy);
    }

    @Test
    public void testNegativeOfArray() {
        double[] array = new double[]{1., 2., -3., 4., -5};
        Array.negativeOfArray(array);
        assertEquals(array[0], -1, 0.0001);
        assertEquals(array[1], -2, 0.0001);
        assertEquals(array[2], 3, 0.0001);
        assertEquals(array[3], -4, 0.0001);
        assertEquals(array[4], 5, 0.0001);
    }

    @Test
    public void testEntryInArray() {
        double[] array = new double[]{3.0, 98.2, 66.1};
        double firstElement = 3.0;
        double secondElement = 33.0;
        assertTrue(Array.entryInArray(array, firstElement));
        assertFalse(Array.entryInArray(array, secondElement));
    }

    @Test
    public void testEntryNullInArray() {
        Integer[] firstArray = new Integer[]{3, null, 5};
        Integer[] secondArray = new Integer[]{3, 18, 5};
        assertTrue(Array.entryNullInArray(firstArray));
        assertFalse(Array.entryNullInArray(secondArray));
    }

    @Test
    public void testNumberOfEvenInArray() {
        double[] firstArray = new double[]{2.0, 4.0, 98.2, 66.1, 6, 16};
        assertEquals(Array.numberOfEvenInArray(firstArray), 4);
        double[] secondArray = new double[]{3.0, 98.2, 66.1, 7};
        assertEquals(Array.numberOfEvenInArray(secondArray), 0);
    }

    @Test
    public void testMaxElementInArray() {
        Integer[] firstArray = new Integer[]{};
        Integer[] secondArray = new Integer[]{3, 18, 5, 18};
        assertEquals(Array.maxElementInArray(firstArray), null);
        assertEquals(Array.maxElementInArray(secondArray), 18, 0.001);
    }

    @Test
    public void testSumOfEvenInArray() {
        double[] firstArray = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(Array.sumOfEvenInArray(firstArray), 9.0);
        double[] secondArray = new double[]{4.0, 56.0};
        assertEquals(Array.sumOfEvenInArray(secondArray), 4.0);
    }

    @Test
    public void testElementsAreMore() {
        double[] firstArray = new double[]{5.0, 15.0, 18.0, 20.0, 25.0, 3.0};
        assertTrue(Array.elementsAreMore(firstArray));
        double[] secondArray = new double[]{4.0, 169, 13.0};
        assertFalse(Array.elementsAreMore(secondArray));
    }

    @Test
    public void testElementMostOftenCommon() {
        double[] firstArray = new double[]{1.0, 1.0, 3.0, 1.0, 3.0};
        assertEquals(Array.elementMostOftenCommon(firstArray), 1.0);
        double[] secondArray = new double[]{4.0, 4.0, 5.0, 4.0, 5.0, 5.0};
        assertEquals(Array.elementMostOftenCommon(secondArray), 4.0);
    }

    @Test
    public void testFirstEqualOfValueIndex() {
        double[] firstArray = new double[]{1.0, 1.0, 3.0, 1.0, 3.0};
        double firstValue = 3.0;
        double secondValue = 5.0;
        assertEquals(Array.firstEqualOfValueIndex(firstArray, firstValue), 2);
        assertEquals(Array.firstEqualOfValueIndex(firstArray, secondValue), -1);
        double[] secondArray = new double[]{4.0, 4.0, 6.0, 4.0, 5.0, 5.0};
        assertEquals(Array.firstEqualOfValueIndex(secondArray, firstValue), -1);
        assertEquals(Array.firstEqualOfValueIndex(secondArray, secondValue), 4);

    }

    @Test
    public void testSwapMinAndMax() {
        double[] firstArray = new double[]{2, 4, 3, 7, 12};
        Array.swapMinAndMax(firstArray);
        assertEquals(firstArray[0], 12.0);
        assertEquals(firstArray[4], 2.0);

    }

    @Test
    public void testGetBitNagation() {
        Integer[] firstArray = new Integer[]{15, 4, 8};
        Array.getBitNagation(firstArray);
        assertEquals(firstArray, new Integer[]{-16, -5, -9});
        Array.getBitNagation(firstArray);
        assertEquals(firstArray, new Integer[]{15, 4, 8});
    }

    @Test
    public void testGetNagationArray() {
        int[] firstArray = new int[]{1, 2, 3};
        int[] nagationArray = new int[firstArray.length];
        nagationArray = Array.getNagationArray(firstArray);
        assertEquals(nagationArray[0], -2);
        assertEquals(nagationArray[1], -3);
        assertEquals(nagationArray[2], -4);
        nagationArray = Array.getNagationArray(nagationArray);
        assertEquals(nagationArray[0], 1);
        assertEquals(nagationArray[1], 2);
        assertEquals(nagationArray[2], 3);
    }

    @Test
    public void testgetSumOfNear() {
        int[] firstArray = new int[]{-7, -8, -9, -152};
        int[] firstArrayOfSumOfNear = Array.getSumOfNear(firstArray);
        assertEquals(firstArrayOfSumOfNear[0], -15);
        assertEquals(firstArrayOfSumOfNear[1], -161);
        int[] secondArray = new int[]{16, -3, 2, -9, 19};
        int[] secondArrayOfSumOfNear = Array.getSumOfNear(secondArray);
        assertEquals(secondArrayOfSumOfNear[0], 13);
        assertEquals(secondArrayOfSumOfNear[1], -7);
        assertEquals(secondArrayOfSumOfNear[2], 19);
    }

    @Test
    public void testGetEvenOrOdd() {
        int[] firstArray = new int[]{4, 33, 3, 6, 12};
        assertTrue(Array.getEvenOrOdd(firstArray)[0]);
        assertFalse(Array.getEvenOrOdd(firstArray)[1]);
        assertFalse(Array.getEvenOrOdd(firstArray)[2]);
        assertTrue(Array.getEvenOrOdd(firstArray)[3]);
        assertTrue(Array.getEvenOrOdd(firstArray)[4]);
    }

    @Test
    public void testNaNInArray() {
        double[] firstArray = new double[]{22., 133., Double.NaN};
        Array.nanInArray(firstArray);
        assertEquals(firstArray[0], 22.);
        assertEquals(firstArray[1], 133.);
        assertEquals(firstArray[2], Double.NaN);
    }

    @Test
    public void testPrintString() {
        String[] firstArray = new String[]{"My", "life", "-", "my", "rules"};
        Array.printStrings(firstArray);
    }

    @Test
    public void testMultiplyOfElements() {
        Double[] firstArray = new Double[]{13., Double.NEGATIVE_INFINITY, 10.};
        Double[] secondArray = new Double[]{Double.NaN, 1., 10., 10.};
        Double[] thirdArray = new Double[]{100., Double.POSITIVE_INFINITY, 10.};
        Double[] fourthArray = new Double[]{100., Double.POSITIVE_INFINITY, 10., Double.NaN, 33., Double.NEGATIVE_INFINITY};
        assertEquals(Array.multiplyOfElement(firstArray), 130.0);
        assertEquals(Array.multiplyOfElement(secondArray), 100.0);
        assertEquals(Array.multiplyOfElement(thirdArray), 1000.0);
        assertEquals(Array.multiplyOfElement(fourthArray), 33000.0);
    }

    @Test
    public void testGetIntArraysPartsOfLong() {
        long[] array = new long[]{1, 2, 3, 4, 5};
        int[] result = Array.getIntArraysPartsOfLong(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(result[2 * i], 0, 0.001);
            assertEquals(result[2 * i + 1], array[i], 0.001);
        }
        array = new long[]{42949672962L};
        result = Array.getIntArraysPartsOfLong(array);
        assertEquals(result[0], 10, 0.001);
        assertEquals(result[1], 2, 0.001);
    }

    @Test
    public void testGetLongFromTwoInts() {
        long number = Array.getLongFromTwoInts(11, 3);
        long[] arr = new long[]{number, 1};
        assertEquals(Array.getIntArraysPartsOfLong(arr)[0], 11, 0.001);
        assertEquals(Array.getIntArraysPartsOfLong(arr)[1], 3, 0.001);
    }


    @Test
    public void testGetPyramidOfdArray() {
        int[][] firstArray = Array.getPyramidOfdArray(3);
        assertEquals(firstArray[0][0], 1);
        assertEquals(firstArray[0][1], 2);
        assertEquals(firstArray[0][2], 3);
        assertEquals(firstArray[1][0], 4);
        assertEquals(firstArray[1][1], 5);
        assertEquals(firstArray[2][0], 6);
        int[][] secondArray = Array.getPyramidOfdArray(5);
        assertEquals(secondArray[0][0], 1);
        assertEquals(secondArray[0][1], 2);
        assertEquals(secondArray[0][2], 3);
        assertEquals(secondArray[0][3], 4);
        assertEquals(secondArray[0][4], 5);
        assertEquals(secondArray[1][0], 6);
        assertEquals(secondArray[1][1], 7);
        assertEquals(secondArray[1][2], 8);
        assertEquals(secondArray[1][3], 9);
        assertEquals(secondArray[2][0], 10);
        assertEquals(secondArray[2][1], 11);
        assertEquals(secondArray[2][2], 12);
        assertEquals(secondArray[3][0], 13);
        assertEquals(secondArray[3][1], 14);
        assertEquals(secondArray[4][0], 15);
    }
}




