/**
 * Pontoo_MK2
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */

public class PlayerTurn extends TurnController {

    public PlayerTurn() {
    }

    public int PlayerTurn(Player player, Dealer dealer, int gamesWon){
        System.out.println("Would you like to draw a card "+player.getName()+"? y/n");
        String choice = kboard.nextLine();

        while (choice.equalsIgnoreCase("y")) {
            player.setHand(dealer.playerDrawCard());

            if (busted(player.getUserTotal())) {
                System.out.println( player.getName()+" is bust with " + player.getUserTotal());
                //Statistics.cardsDrawn(cardsDrawn, totalCardsDrawn);
                break;
            }// end if
            System.out.println("Would you like to draw a card "+player.getName()+ "? y/n");
            choice = kboard.nextLine();
        } return gamesWon;
    }
}
