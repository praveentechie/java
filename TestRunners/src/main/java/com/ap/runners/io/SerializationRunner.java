package com.ap.runners.io;

import static com.ap.runners._common.FileUtils.ensureDirectory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ap.runners.shared.Cycle;
import com.ap.runners.shared.complex_fields.UserDetails;

public class SerializationRunner {
    private static final String OUT_DIR = "./out";
    private static final String FILE_PATH = OUT_DIR + "/serializedUserDetails.txt";

    public static void main(String[] args) {
        SerializationRunner runner = new SerializationRunner();
        ensureDirectory(OUT_DIR);
        runner.serializeObject();
        runner.deserializeObject();
    }

    private void serializeObject() {
        UserDetails userDetails = UserDetails.getInstance();

        System.out.println("Serializing UserDetails " + userDetails + " and saving it to the file " + FILE_PATH);

        try {
            FileOutputStream file = new FileOutputStream(FILE_PATH);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(userDetails);
            outputStream.close();
            file.close();
            System.out.println("********** Serialization completed. Make sure to close File and Object OutputStreams **********");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deserializeObject() {
        System.out.println("\nDeserialize UserDetails from the file " + FILE_PATH);
        try {
            FileInputStream file = new FileInputStream(FILE_PATH);
            ObjectInputStream inputStream = new ObjectInputStream(file);

            UserDetails userDetails = (UserDetails) inputStream.readObject();
            System.out.println(userDetails);

            inputStream.close();
            file.close();
            System.out.println("********** Deserialization completed. Make sure to close File and Object InputStreams **********");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
