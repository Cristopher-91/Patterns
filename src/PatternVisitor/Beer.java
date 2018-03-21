package PatternVisitor;

public class Beer implements IProduct , IPrices{
    private final double price = 3.5;

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
