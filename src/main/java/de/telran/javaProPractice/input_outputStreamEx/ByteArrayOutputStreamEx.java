package de.telran.javaProPractice.input_outputStreamEx;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        String text = "hello world!";

        byte[] buff = text.getBytes();
        try {
            byteArrayOutputStream1.write(buff);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(byteArrayOutputStream1.toString());

        byte[] arr = byteArrayOutputStream1.toByteArray();
        for (byte b : arr){
            System.out.println((char) b);
        }
        System.out.println();

        try(FileOutputStream fos = new FileOutputStream("hello.txt"))
        {
            byteArrayOutputStream1.writeTo(fos);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(FileInputStream fos2 = new FileInputStream("hello.txt")){
            int i = -1;
            while ((i = fos2.read()) != -1){
                System.out.println((char) i);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
