package de.telran.javaProPractice.input_outputStreamEx;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesEx {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("C:\\Users\\Win-10\\IdeaProjects\\JavaProPracticeProject\\notes.txt"))
        {
            int i = -1;
            while ((i = fin.read()) != -1){
                System.out.println((char) i);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
