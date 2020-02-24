package ru.ssau.tk.tatyanna.tatyanna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtOperationTest {
    Operation sqrt = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(123.0), 123.0);
        assertEquals(sqrt.apply(-123.0), -123.0);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(123.0), 123.0);
        assertEquals(sqrt.applyTriple(-123.0), -123.0);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);

    }
}
