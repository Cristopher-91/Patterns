package PatternNullObject;

public class NullEmployee extends AbstractEmployee {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "There is no such employee in the company";
    }
}
