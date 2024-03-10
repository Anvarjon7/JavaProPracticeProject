package de.telran.javaProPractice.lessonCode.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(mediator);
        mediator.concreteColleagueA = concreteColleagueA;
        mediator.concreteColleagueB = concreteColleagueB;

        concreteColleagueA.send("message A");
        concreteColleagueB.send("message B");

    }
}
