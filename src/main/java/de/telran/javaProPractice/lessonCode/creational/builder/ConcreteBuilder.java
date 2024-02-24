package de.telran.javaProPractice.lessonCode.creational.builder;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("buildPartA");
    }

    @Override
    public void buildPartB() {
        product.add("buildPartB");
    }

    @Override
    public void buildPartC() {
        product.add("buildPartC");
    }

    @Override
    public void buildPartD() {
        product.add("buildPartD");
    }

    @Override
    public void buildPartE() {
        product.add("buildPartE");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
