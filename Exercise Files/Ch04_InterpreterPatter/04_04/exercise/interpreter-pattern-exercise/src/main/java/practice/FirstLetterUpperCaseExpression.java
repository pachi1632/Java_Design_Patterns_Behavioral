package practice;

public class FirstLetterUpperCaseExpression implements Expression {

    private RemoveDuplicateWordsExpression removeDuplicateWordsExpression = new RemoveDuplicateWordsExpression();

    @Override
    public String interpret(String context) {
        return removeDuplicateWordsExpression.interpret(context.substring(0, 1).toUpperCase().concat(context.substring(1)));
    }
}
