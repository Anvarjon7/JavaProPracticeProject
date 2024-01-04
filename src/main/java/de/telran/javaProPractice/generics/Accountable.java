package de.telran.javaProPractice.generics;

public interface Accountable<T>{
    T getId();
    int getSum();
    void setSum();

    void setSum(int sum);
}
class Account implements Accountable<String>{
    private String id;
    private int sum;


    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum() {

    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
    public <String> void print(String[] items){
        for (String item : items){
            System.out.println(item);
        }
    }
}
class Program{
    public static void main(String[] args) {
        Accountable<String> acc1 = new Account("2233", 232434);
        Account acc2 = new Account("qwerty", 12234);
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        acc2.print(people);
        String account = acc1.getId();
        System.out.println(account);
        System.out.println(acc2.getId());

    }
}
