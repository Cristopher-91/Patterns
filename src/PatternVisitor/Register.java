package PatternVisitor;

import java.util.ArrayList;

public class Register implements IPrices {
    private IVisitor visitor;
    private static IProduct products;
    private int number;
    private int totalPrice;

    public Register(IVisitor visitor, int number) {
        this.visitor = visitor;
        this.number = number;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public double TotalPrice(ArrayList<Customer.Item> products){
        for (Customer.Item product: products
             ) {
            product.getName().accept(visitor);
            totalPrice += (((IPrices) product).getPrice() * product.getAmount());
        }

        System.out.println("Register number: " + number + " - Total Price: " + totalPrice);
        return totalPrice;
    }
}
