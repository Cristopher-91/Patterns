package PatternState;

public
class MoneyBankrupt implements IMoney {
    @Override
    public void gamble(Player player, int bet) {
        System.out.println("I am broken. Wife is gonna kill me");
    }
}
