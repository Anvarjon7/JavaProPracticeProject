package de.telran.javaProPractice.input_outputStreamEx;

import de.telran.javaProPractice.Person;

import java.io.*;

public class DataInputStreamAndDataOutputStreamEx {
    public static void main(String[] args) {
        Person tom = new Person("Tom",22,1.76,false);

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin")))
        {
            dos.writeUTF(tom.getName());
            dos.writeInt(tom.getAge());
            dos.writeDouble(tom.getHeight());
            dos.writeBoolean(tom.isMarried());
            System.out.println("File has been written");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin")))
        {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean isMarried = dis.readBoolean();
            System.out.printf("Name -> %s Age -> %d Height -> %f Married -> %b",name,age,height,isMarried);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
