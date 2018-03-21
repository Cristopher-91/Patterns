package PatternVisitor;

public class Milk implements IProduct, IPrices {
    private final double price = 2.0;

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
