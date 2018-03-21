package PatternVisitor;

public class Cola implements IProduct, IPrices {
    private final double price = 2.5;

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
