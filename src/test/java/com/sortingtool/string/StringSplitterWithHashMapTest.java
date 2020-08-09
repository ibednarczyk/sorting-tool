package com.sortingtool.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;


class StringSplitterWithHashMapTest {

    @Test
    public void shouldPutKeyAndCorrespondingValueToMap() {
        //given
        StringSplitterWithHashMap splitterWithHashMap = new StringSplitterWithHashMap();
        String url = "https://xyz.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map resultMap = splitterWithHashMap.splitter(url);
        //then
        Assertions.assertEquals("12345", resultMap.get("pass"));
    }

    @Test
    public void shouldPutNotFoundWhenNoValuePassed() {
        //given
        StringSplitterWithHashMap splitterWithHashMap = new StringSplitterWithHashMap();
        String url = "https://xyz.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map resultMap = splitterWithHashMap.splitter(url);
        //then
        Assertions.assertEquals("not found", resultMap.get("cookie"));
    }

    @Test
    public void shouldPutAdditionalParameterWhenPassParameterFound() {
        //given
        StringSplitterWithHashMap splitterWithHashMap = new StringSplitterWithHashMap();
        String url = "https://xyz.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map resultMap = splitterWithHashMap.splitter(url);
        //then
        Assertions.assertTrue(resultMap.containsKey("password"));
    }
    @Test
    public void shouldPutCorrespondingValueWhenPassParameterFound() {
        //given
        StringSplitterWithHashMap splitterWithHashMap = new StringSplitterWithHashMap();
        String url = "https://xyz.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map resultMap = splitterWithHashMap.splitter(url);
        //then
        Assertions.assertEquals(resultMap.get("pass"), resultMap.get("password"));
    }
    @Test
    public void shouldPutRightNumberOfPairsParameterValue() {
        //given
        StringSplitterWithHashMap splitterWithHashMap = new StringSplitterWithHashMap();
        String url = "https://xyz.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        //when
        Map resultMap = splitterWithHashMap.splitter(url);
        //then
        Assertions.assertEquals(5, resultMap.size());
    }

}