package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsExpression implements Expression {

    private LastCharIsDotExpression lastCharIsDotExpression = new LastCharIsDotExpression();

    @Override
    public String interpret(String context) {
        return lastCharIsDotExpression.interpret(Arrays.stream(context.split("\\s"))
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .collect(Collectors.joining(" ")));
    }
}
