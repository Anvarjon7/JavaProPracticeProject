package de.telran.javaProPractice.interfaceEx;

public interface AndroidApp extends App{
    int FREE_PAY = 0;
    int SALE = 1;

    @Override
    default String authorization() {
        return "Default Authorization for Android";
    }
}
