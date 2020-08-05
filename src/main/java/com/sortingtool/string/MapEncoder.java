package com.sortingtool.string;

import java.util.Collections;
import java.util.Map;

import com.google.common.base.Splitter;


public class MapEncoder {

    public Map decode (String input) {

        Map<String, String> map;

        if (input == null) {

            return null;
        }

        if (input.isBlank()) {
            return Collections.emptyMap();
        }

        if (!(input.contains("&") || input.contains("="))) {
            throw new IllegalArgumentException();
        }


        map = Splitter.on("&").withKeyValueSeparator("=").split(input);
        for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }

       return map;


    }





}
