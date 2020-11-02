import javafx.scene.image.Image;

/**
 * Pontoon_MK3
 * Game controller, instantiates Dealer and player
 * All users hands are set, updated and reset from this class
 * User hand values are accessible
 * Initial hand and images are also set
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */

public class PontoonGUI {

    private Dealer dealer;
    private Player player;
    private Image P1;
    private Image P2;
    private Image D1;
    private Image D2;
    private Image BK;

    /**
     * Dealer and player instantiates
     * Initial hands set (2 cards per user)
     */
    public PontoonGUI() {

        dealer = new Dealer();
        player = new Player("Scott");

        P1 = player.setHand(dealer.playerDrawCard());
        P2 = player.setHand(dealer.playerDrawCard());

        D1 = dealer.setHand(dealer.drawCard());
        D2 = dealer.setHand(dealer.drawCard());

        BK = dealer.getBackOfCardImage();
    }

    /**
     * @return Image of card drawn
     * Player draws a card
     */
    public Image playerSetHand(){
        Image image = player.setHand(dealer.playerDrawCard());
        return image;
    }

    /**
     * @return image of card drawn
     * Dealer draws a card
     */
    public Image dealerSetHand(){
        Image image = dealer.setHand(dealer.drawCard());
        return image;
    }

    /**
     * @return int Player Total
     */
    public int getTotalValuePlayer(){
        return player.getUserTotal();
    }

    /**
     * @return int Dealer Total
     */
    public int getTotalValueDealer(){
        return dealer.getUserTotal();
    }

    /**
     * Resets dealer and Player hands to null
     */
    public void resetHand(){
        dealer.resetHand();
        player.resetHand();
    }

    /**
     * @param
     * @param
     * @return
     */
    public boolean getResult(int pTotal, int dTotal) {
        return pTotal > dTotal && pTotal <= 21;
    }

    /**
     * @param total int total
     * @return boolean
     * If total is over 21 false returned under 21 true
     */
    public boolean busted(int total) {
        return total > 21;
    }

    public Image getP1() {
        return P1;
    }

    public Image getP2() {
        return P2;
    }

    public Image getD1() {
        return D1;
    }

    public Image getD2() {
        return D2;
    }

    public Image getBK() {
        return BK;
    }

}
