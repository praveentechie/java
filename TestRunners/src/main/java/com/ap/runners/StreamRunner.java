package com.ap.runners;

import static com.ap.runners.shared.DataProvider.getStringByStringMap;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamRunner {
    public static void main(String[] args) {
        StreamRunner runner = new StreamRunner();
        runner.streamToList();
    }

    private void streamToListException() {
        Map<String, String> testMap = getStringByStringMap(3);
        String matchingValue = testMap.keySet().stream().filter(s -> s.equals("5")).collect(Collectors.toList()).get(0);
        System.out.println(matchingValue);
    }

    private void streamToList() {
        Map<String, String> testMap = getStringByStringMap(3);
        String matchingValue = testMap.keySet().stream().filter(s -> s.equals("5")).findFirst().orElse(null);
        System.out.println(matchingValue);
    }
}
