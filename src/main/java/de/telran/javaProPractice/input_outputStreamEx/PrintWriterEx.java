package de.telran.javaProPractice.input_outputStreamEx;

import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(System.out))
        {
            pw.println("My name is ......");
        }
    }
}
