import java.util.Scanner;

/**
 * Pontoo_MK2
 * Pontoon class is the game controller. Instantiates and controls object actions.
 * Give user options and dealer AI reacts accordingly
 * Tracks and updates all objects and statistics
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Pontoon {

    public Pontoon() {

        Scanner kboard = new Scanner(System.in);
        GamesPlayed gamesCount = new GamesPlayed();
        Statistics stats = new Statistics();

        boolean PlayGame;

        System.out.println("What is your name?");
        String pName = kboard.nextLine();

        int gamesWon = 0;
        int gamesPlayed = 0;
        do {

            Player player = new Player(pName);
            System.out.println("Lets play pontoon "+player.getName());
            Dealer dealer = new Dealer();

            setInitialHand(player, dealer);

            DealerTurn nDealerTurn = new DealerTurn();
            PlayerTurn nPlayerTurn = new PlayerTurn();
            gamesWon = nPlayerTurn.PlayerTurn(player, dealer, gamesWon);
            gamesWon = nDealerTurn.DealerTurn(player, dealer, gamesWon);

            System.out.println("Show " +player.getName()+ "'s hand");
            System.out.println(player.getHand());
            System.out.println("Show dealers hand");
            System.out.println(dealer.getHand());
            System.out.println(player.getName()+",s Total: " + player.getUserTotal());
            System.out.println("Dealer Total: " + dealer.getUserTotal());

            gamesPlayed++;
            gamesCount.playerContinue(gamesPlayed);

            // Choose to play again return True/False
            PlayGame = gamesCount.getPlayGame();

        } while (PlayGame);

        // calculate win percent pass gamesWon and games played total
        stats.statistic(gamesWon, gamesPlayed);
    }

    public void setInitialHand(Player player, Dealer dealer) {
        player.setHand(dealer.playerDrawCard());
        player.setHand(dealer.playerDrawCard());
        dealer.setHand(dealer.drawCard());
        dealer.setHand(dealer.drawCard());
    }
}
