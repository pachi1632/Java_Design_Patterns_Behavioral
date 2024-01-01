package practice;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    // Interpret the sentence here
    Expression expression = new FirstLetterUpperCaseExpression();

    System.out.println(expression.interpret(context));

  }

}
