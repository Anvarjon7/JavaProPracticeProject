package de.telran.javaProPractice.lessonCode.behavioral.command;

public class Invoker {
    private Command command;

    public void storeCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
