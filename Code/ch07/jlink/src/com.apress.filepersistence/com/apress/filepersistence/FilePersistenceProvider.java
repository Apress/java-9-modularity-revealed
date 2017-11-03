package com.apress.filepersistence;

import com.apress.service.interfaces.*;
import java.io.*;

public class FilePersistenceProvider implements FilePersistenceService {

    private static final String FILENAME = "C:\\Java9\\example.txt";

    // for Linux
    // private static final String FILENAME = "Java9/example.txt";
    private BufferedWriter bufferedWriter = null;
    private FileWriter fileWriter = null;

    public void saveMessageIntoFile(String message) {

        try {

            fileWriter = new FileWriter(FILENAME);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            System.out.println("Done");
        }
        catch (IOException e) {

            e.printStackTrace();

        }
        finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}