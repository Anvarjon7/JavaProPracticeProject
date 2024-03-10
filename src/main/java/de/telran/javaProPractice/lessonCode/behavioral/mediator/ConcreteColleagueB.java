package de.telran.javaProPractice.lessonCode.behavioral.mediator;

public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void notify(String message){
        System.out.println(message);
    }

    public void send(String message){
        mediator.send(message,this);
    }
}
