package ru.ssau.tk.tatyanna.tatyanna;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TangentOperationTest {
    Operation tangent = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(tangent.apply(123.0), 123.0);
        assertEquals(tangent.apply(-123.0), -123.0);
        assertEquals(tangent.apply(Double.NaN), Double.NaN);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(tangent.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangent.applyTriple(123.0), 123.0);
        assertEquals(tangent.applyTriple(-123.0), -123.0);
        assertEquals(tangent.applyTriple(Double.NaN), Double.NaN);
        assertEquals(tangent.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(tangent.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);

    }
}