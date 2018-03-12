package PatternState;

public class Player {
    protected int money;
    private IMoney moneyState = null;

    public Player(int money) {
        this.money = money;
        this.moneyState = new MoneyFull();
    }
    public void gamble(int bet){
        this.moneyState.gamble(this, bet);

    }
    public void playAgain(){
        if(money<=0) this.moneyState = new MoneyBankrupt();
    }
}
