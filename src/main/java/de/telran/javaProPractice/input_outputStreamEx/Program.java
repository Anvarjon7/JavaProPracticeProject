package de.telran.javaProPractice.input_outputStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "Hello World!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("notes.txt")) {
            byte[] buffer = text.getBytes();

            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream("notes.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        try (FileInputStream fio = new FileInputStream("notes.txt")) {

            byte[] bytes = new byte[256];
            System.out.println("File data:");

            int count;
            while ((count = fio.read(bytes)) != -1) {
                for (int i = 0; i < count; i++) {
                    System.out.println((char) bytes[i]);
                }
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

    }
}
