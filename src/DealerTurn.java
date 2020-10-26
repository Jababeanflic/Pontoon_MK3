/**
 * Pontoo_MK2
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */

public class DealerTurn extends TurnController {


    public DealerTurn() {
    }

    public int DealerTurn(Player player, Dealer dealer, int gamesWon) {
        if (player.getUserTotal() <= 21) {
            while (dealer.getUserTotal() < player.getUserTotal() & dealer.getUserTotal() <= 21) {
                dealer.setHand(dealer.drawCard());

                if (busted(dealer.getUserTotal())) {
                    System.out.println("Dealer bust with " + dealer.getUserTotal() + " you win!");
                    dealer.UserShout();
                    gamesWon++;
                    break;
                }
            }
        }
        if (dealer.getUserTotal() <= 21) {
            if (getResult(player.getUserTotal(), dealer.getUserTotal())) {
                System.out.println("You have won with a total of " + player.getUserTotal() + " Dealer has " + dealer.getUserTotal());
                gamesWon++; // track games one
            } else {
                System.out.println("You have lost with a total of " + player.getUserTotal() + " Dealer has " + dealer.getUserTotal());
                player.UserShout();
            }// end if
        } return gamesWon;
    }
}
