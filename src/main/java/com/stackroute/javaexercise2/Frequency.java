package com.stackroute.javaexercise2;
import java.io.*;
public class Frequency {

    public int contentOfFileTimes(String filename) throws IOException {
        File file = new File(filename);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        return countWord;
    }

}
