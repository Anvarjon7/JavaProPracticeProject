package de.telran.javaProPractice.input_outputStreamEx;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinallyEx {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try
        {
            fin = new FileInputStream("C:\\Users\\Win-10\\IdeaProjects\\JavaProPracticeProject\\notes.txt");

            int i = -1;
            while ((i = fin.read()) != -1){
                System.out.println((char) i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fin!= null)
                    fin.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
