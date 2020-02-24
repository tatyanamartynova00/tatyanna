package ru.ssau.tk.tatyanna.tatyanna;

import java.util.Collection;
import java.util.LinkedList;

public class Array {
    public static double[] createArray(int length) {
        double[] myArray = new double[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public static double[] createArrayOneTwo(int lenght) {
        double[] myArray = new double[lenght];
        myArray[0] = 2;
        myArray[lenght - 1] = 2;
        for (int i = 1; i < lenght - 1; i++) {
            myArray[i] = 1;
        }
        return myArray;
    }

    public static double[] createOddArray(int lenght) {
        double[] myArray = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            myArray[i] = (2 * i) + 1;
        }
        return myArray;
    }

    static public double[] createEvenArray(int lenght) {
        double[] myArray = new double[lenght];
        for (int i = lenght - 1; i >= 0; i--) {
            myArray[i] = (2 * i) + 2;
        }
        return myArray;
    }

    public static double[] createFibonacciArray(int lenght) {
        double[] myArray = new double[lenght];
        myArray[0] = 1;
        myArray[1] = 1;
        for (int i = 2; i < lenght; i++) {
            myArray[i] = myArray[i - 1] + myArray[i - 2];
        }
        return myArray;
    }

    public static double[] createSquareIndexArray(int lenght) {
        double[] myArray = new double[lenght];
        for (int i = 0; i < lenght; i++) {
            myArray[i] = i * i;
        }
        return myArray;
    }

    public static double[] solutionsOfSquareEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return new double[0];
            } else {
                double x = -c / b;
                return new double[]{x};
            }
        }
        double D = b * b - 4 * a * c;
        if (D == 0) {
            double x0 = -b / (2 * a);
            return new double[]{x0};
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            return new double[]{x1, x2};


        } else {
            return new double[0];
        }

    }

    public static double[] numbersAreNotDivisibleByThree(int lenght) {
        double[] array = new double[lenght];
        int number = 1;
        for (int j = 0; j < lenght; j++) {
            if (number % 3 == 0) {
                number++;
            }
            array[j] = number;
            number++;
        }
        return array;
    }

    public static double[] arithmeticProgression(double a1, double difference, int lenght) {
        double[] array = new double[lenght];
        array[0] = a1;
        for (int i = 1; i < lenght; i++) {
            array[i] = a1 + difference * ((i + 1) - 1);

        }
        return array;
    }

    public static double[] geometricProgression(double b1, double q, int lenght) {
        double[] array = new double[lenght];
        array[0] = b1;
        for (int i = 1; i < lenght; i++) {
            array[i] = array[i - 1] * q;
        }
        return array;


    }

    public static double[] symmetricalArray(int lenght) {
        double[] array = new double[lenght];
        for (int i = 0; i < Math.round((double) lenght / 2); i++) {
            array[i] = i + 1;
            array[lenght - i - 1] = i + 1;
        }
        return array;
    }

    public static void negativeOfArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
    }

    public static boolean entryInArray(double[] array, double element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean entryNullInArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }

    public static int numberOfEvenInArray(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static Integer maxElementInArray(Integer[] array) {
        Integer max = 0;
        if (array.length == 0) {
            return null;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static double sumOfEvenInArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static boolean elementsAreMore(double[] array) {
        int dividedByFirst = 0;
        int dividedByLast = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[0] == 0) {
                dividedByFirst = dividedByFirst + 1;
            }
            if (array[i] % array[array.length - 1] == 0) {
                dividedByLast = dividedByLast + 1;
            }
        }
        if (dividedByFirst > dividedByLast) {
            return true;
        } else {
            return false;
        }
    }

    public static double elementMostOftenCommon(double[] array) {
        double candidate = array[0];
        int maxNumberOfEntry = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
                if (count > maxNumberOfEntry) {
                    candidate = array[j];
                    maxNumberOfEntry = count;
                }
            }
        }
        return candidate;

    }

    public static int firstEqualOfValueIndex(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void swapMinAndMax(double[] array) {
        double firstMaxElement = Double.MIN_VALUE;
        double firstMinElement = Double.MAX_VALUE;
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMaxElement) {
                firstMaxElement = array[i];
                indexOfMax = i;
            }
            if (array[i] < firstMinElement) {
                firstMinElement = array[i];
                indexOfMin = i;
            }
        }
        array[indexOfMax] = firstMinElement;
        array[indexOfMin] = firstMaxElement;
    }

    public static void getBitNagation(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] getNagationArray(int[] array) {
        int[] nagationArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nagationArray[i] = ~array[i];
        }
        return nagationArray;
    }

    public static int[] getSumOfNear(int[] array) {
        int[] arrayOfSumOfNear;
        if (array.length % 2 == 0) {
            arrayOfSumOfNear = new int[array.length / 2];
            for (int i = 0; i < arrayOfSumOfNear.length; i++) {
                arrayOfSumOfNear[i] = array[2 * i] + array[2 * i + 1];
            }
        } else {
            arrayOfSumOfNear = new int[array.length / 2 + 1];
            for (int i = 0; i < arrayOfSumOfNear.length - 1; i++) {
                arrayOfSumOfNear[i] = array[2 * i] + array[2 * i + 1];
            }
            arrayOfSumOfNear[arrayOfSumOfNear.length - 1] = array[array.length - 1];
        }
        return arrayOfSumOfNear;
    }

    public static boolean[] getEvenOrOdd(int[] array) {
        boolean[] arrayGetEvenOrOdd = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayGetEvenOrOdd[i] = true;
            } else {
                arrayGetEvenOrOdd[i] = false;
            }
        }
        return arrayGetEvenOrOdd;
    }

    public static void nanInArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Double.isNaN(array[i])) {
                return;
            } else {
                java.util.Arrays.sort(array);
            }
        }
    }

    public static void printStrings(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Double multiplyOfElement(Double[] array) {
        double multiply = 1;
        for (Double element : array) {
            if (element.isNaN() || element == Double.POSITIVE_INFINITY || element == Double.NEGATIVE_INFINITY) {
                continue;
            }
            multiply = multiply * element;
        }
        return multiply;
    }

    public static int[] getIntArraysPartsOfLong(long[] array) {
        int[] result = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            result[2 * i] = (int) (array[i] >> 32);
            result[2 * i + 1] = (int) array[i];
        }
        return result;
    }

    public static long getLongFromTwoInts(int first, int second) {
        return (((long) first) << 32 | second);
    }

    public static int[][] getPyramidOfdArray(int length) {
        int[][] newArray = new int[length][];
        int element = 1;
        for (int i = 0; i < length; i++) {
            newArray[i] = new int[length - i];
            for (int j = 0; j < (length - i); j++) {
                newArray[i][j] = element;
                element++;
            }
        }
        return newArray;
    }
}


