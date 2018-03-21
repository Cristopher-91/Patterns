package PatternVisitor;

import java.util.ArrayList;

public class Register implements IPrices {
    private Customer visitor;
    private int number;
    private double totalPrice = 0;

    public Register(Customer visitor, int number) {
        this.visitor = visitor;
        this.number = number;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public double TotalPrice(ArrayList<IProduct> products){
        //Resetuje kasę
        totalPrice = 0;
        for (IProduct product: products
             ) {
            product.accept(visitor);
            totalPrice += (((IPrices) product).getPrice() * visitor.getAmount());
        }
        visitor.setCash(visitor.getCash() - totalPrice);
        System.out.println("Register number: " + number + " - Total Price: " + totalPrice);
        return totalPrice;
    }
}
