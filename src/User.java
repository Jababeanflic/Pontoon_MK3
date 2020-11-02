import javafx.scene.image.Image;
import java.util.ArrayList;

/**
 * Pontoon_MK3
 * Super class for all users including players and dealer
 * object holding player cards and hand total
 *
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */
public abstract class User {

    private ArrayList<Card> hand;
    private int playerTotal;


    /**
     * Constructor Array List to hold card objects
     */
    public User() {
        hand = new ArrayList<>();
    }

    /**
     * @return Hand object containing card objects
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param playerCard Card object
     *                   Adds card object to card
     *                   Add card value to cumulative player total
     * @return
     */
    public Image setHand(Card playerCard) {
        hand.add(playerCard);
        playerTotal = playerTotal + playerCard.getValue();
        return playerCard.getImage();
    }

    /**
     * Clear all card objects from hand Array list
     */
    public void resetHand() {
        hand.clear();
        playerTotal = 0;
    }

    /**
     * @return Int player current total
     */
    public int getUserTotal() {
        return playerTotal;
    }

    public void setUserTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }

    /**
     * Polymorphism test method
     */
    public void UserShout() {
        System.out.println("Damn it I lost again!!");
    }

    public int getPlayerTotal() {
        return playerTotal;
    }
}

