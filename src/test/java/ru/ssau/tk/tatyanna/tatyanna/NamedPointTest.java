package ru.ssau.tk.tatyanna.tatyanna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NamedPointTest {
    @Test
    public void FirstConstructor() {
        NamedPoint FirstPoint = new NamedPoint();
        assertEquals(FirstPoint.x, 0.0);
        assertEquals(FirstPoint.length(), 0.0);
        assertEquals(FirstPoint.getName(), "Origin");
    }

    @Test
    public void SecondConstructor() {
        NamedPoint SecondPoint = new NamedPoint(1, 2, 2);
        assertEquals(SecondPoint.y, 2.0);
        assertEquals(SecondPoint.length(), 3.0);
    }

    @Test
    public void ThirdConstructor() {
        NamedPoint ThirdPoint = new NamedPoint(1, 2, 2, "Point");
        assertEquals(ThirdPoint.y, 2.0);
        assertEquals(ThirdPoint.length(), 3.0);
        assertEquals(ThirdPoint.getName(), "Point");
    }

    @Test
    public void testToString() {
        NamedPoint first = new NamedPoint(-2, 16, 0, "first");
        NamedPoint second = new NamedPoint(23.4, 7, 199);
        assertEquals(first.toString(), "first [-2.0, 16.0, 0.0]");
        assertEquals(second.toString(), "[23.4, 7.0, 199.0]");
    }
}

