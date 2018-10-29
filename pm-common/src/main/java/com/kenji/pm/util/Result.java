package com.kenji.pm.util;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private static Map<String, Object> result = new HashMap<>();

    public static Map<String, Object> ok(String name, Object data) {
        result.put(name, data);
        return result;
    }
}
