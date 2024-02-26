package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.composite;

public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("Invalid operation");
    }

    @Override
    public Component getChild(int index) {
        throw new RuntimeException("Invalid operation");
    }
}
