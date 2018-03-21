package PatternVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements IVisitor {

    public class Item {
        private IProduct name;
        private int amount;

        public Item(IProduct name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public IProduct getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }
    }

    private double cash = 20.0;
    private ArrayList<Item> shoopingCart = new ArrayList();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void visit(Milk milk) {
        System.out.println("How many cartoons of milk do I need ?");
        int amount = scanner.nextInt();
        shoopingCart.add(new Item(milk, amount));

    }

    @Override
    public void visit(Cola cola) {
        System.out.println("How many bootles of cola do I need ?");
        int amount = scanner.nextInt();
        shoopingCart.add(new Item(cola, amount));

    }

    public void visit(Beer beer) {
        System.out.println("Do I really need beer ?");
        String answer = scanner.next();
        if("Yes".equalsIgnoreCase(answer) ){
            System.out.println("Ok. But just one bootle.");
            shoopingCart.add(new Item(beer, 1));

        }
        else if("No".equalsIgnoreCase(answer)) {
            System.out.println("Good. Your don't want to be alcoholic");
        }
    }

    public double getCash() {
        return cash;
    }

    public ArrayList<Item> getShoopingCart() {
        return shoopingCart;
    }
}
