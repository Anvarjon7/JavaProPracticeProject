package de.telran.javaProPractice.lessonCode.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.source = "aaaaaaaa";
        context.vocabulary = 'a';
        NonTerminalExpression nonTerminalExpression = new NonTerminalExpression();
        nonTerminalExpression.interpreter(context);
        System.out.println(context.result);

        recursion(3);
    }

    public static void recursion(int n){
        System.out.println(n);
        if (n == 0){
            return;
        }
        recursion(n - 1);
        System.out.println(n);
    }
}
