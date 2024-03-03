package de.telran.javaProPractice.lessonCode.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class TemplateMethod {
    public abstract void operationA();
    public abstract void operationB();
    public abstract void operationC();

    public void construct(){
        operationA();
        operationB();
        operationC();
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Hello");
        lists.add("World!");

        List list = new ArrayList();
        list.add("Hello");
        list.add(1);

        list.add(new TemplateMethod() {
            @Override
            public void operationA() {
                
            }

            @Override
            public void operationB() {

            }

            @Override
            public void operationC() {

            }
        });
        
        for (Object o : list){
            if (o instanceof String){
                
            } else if (o instanceof Integer) {
                
            } else if (o instanceof TemplateMethod) {
                
            }
        }

        Iterator<String> iterator = lists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
