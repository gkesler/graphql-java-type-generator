package graphql.java.generator.argument;

public class ArgumentName_Simple
        implements ArgumentNameStrategy {
    
    @Override
    public String getArgumentName(ArgContainer object) {
        if (object == null) return null;
        if (object.getSuggestedName() != null) return object.getSuggestedName();
        if (object.getIndex() != -1) return "arg" + object.getIndex();
        return null;
    }
}
