package PatternState;

public class MoneyFull implements IMoney {

    //Założenie o braku zwycięstwa - Player tylko traci
    @Override
    public void gamble(Player player, int bet){

            player.money -= bet;
            System.out.println("I play and bet " + bet);
            System.out.println("Money left: " + player.money);
            player.playAgain();
        }
    }

