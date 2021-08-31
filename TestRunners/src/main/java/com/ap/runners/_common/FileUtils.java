package com.ap.runners._common;

import java.io.File;

public class FileUtils {
    public static boolean ensureDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            return directory.mkdir();
        }
        return true;
    }
}
