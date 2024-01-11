package de.telran.javaProPractice.exceptionHandlingEx;

public class ThrowEx {
    public static void main(String[] args) {
        try {
            int result = getFactorial(4);
            System.out.println(result);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        getFactorialEx(-1);
    }
    public static int getFactorial(int num) throws Exception{
        if (num < 1) throw new Exception("The number less than 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int getFactorialEx(int num){
        int res = 1;
        try{
            if (num < 1) throw new Exception("The number less than 1");
            for (int i = 1; i < num; i++) {
                res *= i;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            res=num;
        }
        return res;
    }

}
