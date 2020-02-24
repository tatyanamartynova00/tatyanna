package ru.ssau.tk.tatyanna.tatyanna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    @Test
    public void testToString() {
        Point firstPoint = new Point(3, -4, 88);
        Point secondPoint = new Point(0, 13333, 7);
        assertEquals(firstPoint.toString(), "[3.0, -4.0, 88.0]");
        assertEquals(secondPoint.toString(), "[0.0, 13333.0, 7.0]");
    }

}
