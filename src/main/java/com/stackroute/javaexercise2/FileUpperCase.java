package com.stackroute.javaexercise2;
import java.io.*;

public class FileUpperCase {

    public String convertToUpperCase(String inputfile) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputfile));
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                line = bufferedReader.readLine();
            }
            System.out.println(stringBuilder.toString().toUpperCase());
            return stringBuilder.toString().toUpperCase();
        } finally {
            bufferedReader.close();
        }

    }

}
