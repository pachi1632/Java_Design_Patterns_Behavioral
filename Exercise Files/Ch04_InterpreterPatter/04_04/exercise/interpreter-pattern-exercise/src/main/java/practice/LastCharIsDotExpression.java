package practice;

public class LastCharIsDotExpression implements Expression {
    @Override
    public String interpret(String context) {
        return context.substring(context.length()-1).equals(".") ? context : context+".";
    }
}
