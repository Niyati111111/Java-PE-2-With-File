package com.stackroute.javaexercise2;
import java.io.*;
import java.util.Scanner;
public class FileUpperCase {

    public void convertToUpperCase(String inputfile) {

        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(inputfile);

            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line.toUpperCase());
            }

            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + inputfile + "'");
        }

    }

}
