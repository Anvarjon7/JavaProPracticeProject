package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.decorator;

public class Decorator extends Component {
    protected Component component;
    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
