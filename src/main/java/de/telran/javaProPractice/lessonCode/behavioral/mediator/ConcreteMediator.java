package de.telran.javaProPractice.lessonCode.behavioral.mediator;

public class ConcreteMediator extends Mediator{
    protected ConcreteColleagueA concreteColleagueA;
    protected ConcreteColleagueB concreteColleagueB;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleagueA) {
            concreteColleagueB.notify(message);
        }else {
            concreteColleagueA.notify(message);
        }
    }
}
