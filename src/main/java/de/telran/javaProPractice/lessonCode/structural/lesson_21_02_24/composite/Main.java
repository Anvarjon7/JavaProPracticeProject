package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.composite;

public class Main {
    public static void main(String[] args) {
        Component root = new Composite("ROOT");

        Component branch1 = new Composite("BRANCH1");
        Component branch2 = new Composite("BRANCH2");
        Component branch3 = new Composite("BRANCH3");

        root.add(branch1);
        root.add(branch2);
        root.add(branch3);

        Component leaf1 = new Leaf("LEAF1");
        Component leaf2 = new Leaf("LEAF2");
        Component leaf3 = new Leaf("LEAF3");

        branch1.add(leaf1);
        branch2.add(leaf2);
        branch3.add(leaf3);

        root.operation();
    }
}
