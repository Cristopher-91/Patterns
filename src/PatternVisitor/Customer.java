package PatternVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements IVisitor {

    private double cash = 20.0;
    private ArrayList<IProduct> shoopingCart = new ArrayList();
    private int amount;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void visit(Milk milk) {
        System.out.println("How many cartoons of milk do I need ?");
        amount = scanner.nextInt();
    }

    @Override
    public void visit(Cola cola) {
        System.out.println("How many bootles of cola do I need ?");
        amount = scanner.nextInt();
    }

    public void visit(Beer beer) {
        System.out.println("Do I really need beer ?");
        String answer = scanner.next();
        if("Yes".equalsIgnoreCase(answer) ){
            System.out.println("Ok. But just one bootle.");
            amount = 1;

        }
        else if("No".equalsIgnoreCase(answer)) {
            System.out.println("Good. Your don't want to be alcoholic");
            amount = 0;
        }
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ArrayList<IProduct> getShoopingCart() {
        return shoopingCart;
    }

    public int getAmount() {
        return amount;
    }

    public void buySomething(IProduct product){
        shoopingCart.add(product);
    }

    public void moneyLeft(){
        System.out.println("I have left: " + this.getCash());
    }

}
