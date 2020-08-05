package com.sortingtool.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Map;

class MapEncoderTest {

    @Test
    public void shouldReturnAnEmptyMap() throws IllegalAccessException {

        //given
        MapEncoder mapEncoder = new MapEncoder();
        String input = "   ";
        //when
        Map result = mapEncoder.decode(input);
        //then
        Assertions.assertTrue(result.isEmpty());

    }

    @Test
    public void shouldReturnKeysAndValues() throws IllegalAccessException {

        //given
        MapEncoder mapEncoder = new MapEncoder();
        String input = "pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map result = mapEncoder.decode(input);
        //then
        Assertions.assertFalse(result.isEmpty());

    }

    @Test
    public void shouldThrowAnIllegalArgumentException() throws IllegalArgumentException {
        //given
        MapEncoder mapEncoder = new MapEncoder();
        String input = "pass";
        //when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> mapEncoder.decode(input));
    }

    @Test
    public void shouldThrowNullPointerException() throws IllegalArgumentException {
        //given
        MapEncoder mapEncoder = new MapEncoder();
        String input = null;
        //when & then
        Assertions.assertNull(mapEncoder.decode(input));
    }






}