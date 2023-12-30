package de.telran.javaProPractice.interfaceEx2;

import java.sql.SQLOutput;

public class PizzaEngine implements Customer,Pizzeola,Courier{

    @Override
    public void orderPizza() {
        System.out.println("Ordered Pizza");
    }

    @Override
    public void eatPizza() {
        System.out.println("Ate Pizza");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing ingredients");
    }

    @Override
    public void cookPizza() {
        System.out.println("Baked Pizza");
    }

    @Override
    public void packPizza() {
        System.out.println("Packing Order");
    }

    @Override
    public void deliverPizza() {
        System.out.println("Order Delivered");
    }
}
