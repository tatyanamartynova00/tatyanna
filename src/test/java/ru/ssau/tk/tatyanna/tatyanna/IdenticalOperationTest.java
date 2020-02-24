package ru.ssau.tk.tatyanna.tatyanna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class IdenticalOperationTest {
    Operation identy = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identy.apply(123.0), 123.0);
        assertEquals(identy.apply(-123.0), -123.0);
        assertEquals(identy.apply(Double.NaN), Double.NaN);
        assertEquals(identy.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(identy.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);

    }
    @Test
    public void testApplyTriple() {
        assertEquals(identy.applyTriple(123.0), 123.0);
        assertEquals(identy.applyTriple(-123.0), -123.0);
        assertEquals(identy.applyTriple(Double.NaN), Double.NaN);
        assertEquals(identy.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(identy.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);

    }

}
