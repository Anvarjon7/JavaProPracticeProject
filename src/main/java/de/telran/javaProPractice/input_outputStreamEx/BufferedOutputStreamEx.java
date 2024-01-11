package de.telran.javaProPractice.input_outputStreamEx;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        String text = "Hello There!!!";
        try(FileOutputStream fos = new FileOutputStream("notes.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos))
        {
            byte[] buffer = text.getBytes();
            bos.write(buffer,0, buffer.length);
        }
        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
