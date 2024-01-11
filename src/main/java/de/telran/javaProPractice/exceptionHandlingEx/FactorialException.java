package de.telran.javaProPractice.exceptionHandlingEx;

public class FactorialException extends Exception{
    private int num;
    public FactorialException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
class Factorial{
    public static int getFactorial(int num) throws FactorialException{
        int res = 1;
        if (num < 1) throw new FactorialException("The number less than 1",num);

        for (int i = 1; i < num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        try{
            int result = getFactorial(-1);
            System.out.println(result);
        }
        catch (FactorialException factorialException){
            System.out.println(factorialException.getMessage() + " -> " + factorialException.getNum());
        }
    }
}
