package com.company;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void Setup(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        assertEquals(2, util.everyNthChar(new char[]{'h','e','l','l','o'},2).length);
        assertArrayEquals(new char []{'e','l'}, util.everyNthChar(new char[]{'h','e','l','l','o'}, 2));
        assertArrayEquals(new char []{'h','e','l','l','o'}, util.everyNthChar(new char[]{'h','e','l','l','o'}, 8));
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertEquals("A", util.removePairs("A"));
        assertNull("Not Null", util.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, util.converter(10, 5), 0);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converterException() {
        assertEquals(util.converter(10, 0), 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("abc"));
        assertEquals("abcdef", util.nullIfOddLength("abcdef"));
    }
}