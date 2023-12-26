package de.telran.javaProPractice.interfaceEx;

public interface IosApp extends App{
    void verifyAppStore();

    default int sum (int a, int b){
        return sumAll(a,b);
    }
    default int sum(int a,int b, int c){
        return sumAll(a,b,c);
    }
    private int sumAll(int... values){
        int res = 0;
        for (int val: values){
            res += val;
        }
        return res;
    }
}
