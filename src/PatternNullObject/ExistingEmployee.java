package PatternNullObject;

public class ExistingEmployee extends AbstractEmployee {

    public ExistingEmployee(String name){
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
