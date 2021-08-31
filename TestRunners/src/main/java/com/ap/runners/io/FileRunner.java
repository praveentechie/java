package com.ap.runners.io;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class FileRunner {
    /**
     * If running via bash, run from target classes.
     * Change the static variable #com.ap.runners.FileRunner.directory as required
     */
    private static final String directory = "C:\\Users\\arunachalamp\\src\\poc\\java\\src\\main\\java\\com\\ap" +
          "\\runners\\shared";
    public static void main(String[] args) {
        FileRunner fileRunner = new FileRunner();
        fileRunner.readFileFromDir();
    }

    private void readFileFromDir() {
        File dumpDirectory = new File(directory);
        System.out.println(System.getProperty("user.dir"));
        boolean dirExists = dumpDirectory.exists();
        System.out.println("Directory " + directory + " exists? " + dirExists);
        if (dirExists) {
            Collection<File> files = FileUtils.listFiles(dumpDirectory, null, true);
            System.out.println(files);
            files.forEach(file -> {
                System.out.println("File " + file.getName() + " and parent " + file.getParentFile());
            });
        }
    }
}
