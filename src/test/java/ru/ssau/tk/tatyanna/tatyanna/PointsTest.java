package ru.ssau.tk.tatyanna.tatyanna;

import org.junit.jupiter.api.Test;
import ru.ssau.tk.tatyanna.tatyanna.Points;
import ru.ssau.tk.tatyanna.tatyanna.Point;
import static org.junit.jupiter.api.Assertions.*;

public class PointsTest {
    private static double ACCURACY = 0.00005;

    @Test
    public void testSum() {
        assertTrue(Points.equalsApproximately(Points.sum(new Point(10, 20, 30), new Point(1, 2, 3)),new Point(11, 22, 33)));
    }

    @Test
    public void testSubtract() {
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(10.4, 20.5, 30.6), new Point(1, 2, 3)),new Point(9.4, 18.5, 27.6)));
    }

    @Test
    public void testMultiply() {
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(3.1, -8, 1.3), new Point(2.5, -2, 3)),new Point(7.75, 16, 3.9)));
    }

    @Test
    public void testDivide() {
        assertTrue(Points.equalsApproximately(Points.divide(new Point(-14, 6, 3), new Point(7, -2, 3)),new Point(-2, -3, 1)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(Points.equalsApproximately(Points.enlarge(new Point(14, -3, 1.8),2.6),new Point(36.4, -7.8, 4.68)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(1, 2, 3)),Math.sqrt(14), ACCURACY);
    }

    @Test
    public void testOpposite() {
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(-20, 7, -31)), new Point(20, -7, 31)));
    }

    @Test
    public void testInverse() {
        assertTrue(Points.equalsApproximately(Points.inverse(new Point(-2, 5, 10)), new Point(-0.5, 0.2, 0.1)));
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(3.7, -7, 1.9), new Point(2.6, -2, 3.9)),31.03);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(Points.vectorProduct(new Point(10, 20, 30), new Point(1, -4, 5)),new Point(220, -20, -60)));
    }
}