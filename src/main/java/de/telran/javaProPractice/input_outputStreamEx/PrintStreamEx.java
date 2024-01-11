package de.telran.javaProPractice.input_outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) {
        String text = "Hii, there!";
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Win-10\\IdeaProjects\\JavaProPracticeProject\\notes.txt");
             PrintStream ps = new PrintStream(fos)) {
            ps.println(text);
            System.out.println("The file has been written to");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        try(PrintStream printStream = new PrintStream("notes2.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to JAVA");

            printStream.printf("Name: %s Age: %d \n","Tom",23);

            String message = "PrintStream";
            byte[] bytes = message.getBytes();
            printStream.write(bytes);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
