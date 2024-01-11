package de.telran.javaProPractice.input_outputStreamEx;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {
    public static void main(String[] args) {
        byte[] arr1 = new byte[]{1,3,5,7};

        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr1);

        int b;
        while((b = byteArrayInputStream1.read()) != -1){
            System.out.println(b);
        }

        String text = "HELLO WORLD!";
        byte[] arr2 = text.getBytes();

        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr2,0,5);
        int c;
        while ((c = byteArrayInputStream2.read()) != -1){
            System.out.println((char) c);
        }
    }
}
