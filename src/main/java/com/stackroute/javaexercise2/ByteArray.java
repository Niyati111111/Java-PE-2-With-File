package com.stackroute.javaexercise2;
import java.io.*;
public class ByteArray {
    byte[] byteFileContent(String Filename) throws IOException {


        File file = new File("/home/niyati/Rob.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        String st;
        while ((st = br.readLine()) != null)
        {
            s+=st;
        }
        byte[] bytearr1= s.getBytes();

        return bytearr1;
    }
}
