package de.telran.javaProPractice.input_outputStreamEx;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferedInputStreamEx {
    public static void main(String[] args) {
        String text = "I love JAVA!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)){
            int c;
            while ((c = bufferedInputStream.read()) != -1){
                System.out.println((char) c);
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}
