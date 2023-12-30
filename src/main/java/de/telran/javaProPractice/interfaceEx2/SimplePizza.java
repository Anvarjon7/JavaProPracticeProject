package de.telran.javaProPractice.interfaceEx2;

public class SimplePizza {
    public static void main(String[] args) {
        PizzaEngine pizzaEngine = new PizzaEngine();
        pizzaEngine.eatPizza();
        pizzaEngine.cookPizza();

        Customer customer = pizzaEngine;
        customer.orderPizza();

        Pizzeola pizzeola = pizzaEngine;
        pizzeola.cookPizza();
        pizzeola.prepareIngredients();
        pizzeola.eatPizza();

        Courier courier = pizzaEngine;
        courier.packPizza();
        courier.deliverPizza();

    }
}
