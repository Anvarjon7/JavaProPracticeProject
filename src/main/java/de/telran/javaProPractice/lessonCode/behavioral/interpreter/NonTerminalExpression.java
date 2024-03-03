package de.telran.javaProPractice.lessonCode.behavioral.interpreter;

public class NonTerminalExpression extends AbstractExpression{

    private AbstractExpression terminalExpression;
    private AbstractExpression nonTerminalExpression;

    @Override
    public void interpreter(Context context) {
        if (context.position < context.source.length()){
            terminalExpression = new TerminalExpression();
            terminalExpression.interpreter(context);
            context.position++;

            if (context.result){
                nonTerminalExpression = new NonTerminalExpression();
                nonTerminalExpression.interpreter(context);
            }
        }
    }
}
