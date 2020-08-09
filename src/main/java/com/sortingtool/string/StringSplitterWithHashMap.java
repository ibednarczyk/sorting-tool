package com.sortingtool.string;

import java.util.HashMap;
import java.util.Map;

public class StringSplitterWithHashMap {

    public Map splitter(String url) {

        String[] urlParameters = url.split("\\?")[1].split("&");

        Map<String, String> map = new HashMap<>();

        for(String urlPart : urlParameters) {
            String[] keyValues = urlPart.split("=");
            if (keyValues.length == 1) {
                map.put(keyValues[0], "not found");
            } else {
                map.put(keyValues[0], keyValues[1]);
            }
        }

        if (map.containsKey("pass")) {
            map.put("password", map.get("pass"));
        }

        return map;

    }

}
