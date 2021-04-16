package com.ap.runners.shared;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    public static Map<String, String> getStringByStringMap(Integer elements) {
        Map<String, String> stringByStringMap = new HashMap<>(elements);
        for (; elements > 0; --elements) {
            stringByStringMap.put(elements.toString(), elements.toString());
        }
        return stringByStringMap;
    }
}
