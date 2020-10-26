import java.util.ArrayList;

/**
 * Pontoo_MK2
 * Super class for all users including players and dealer
 * object holding player cards and hand total
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public abstract class User {

    private ArrayList<Card> hand;
    private int playerTotal;


    /**
     * Constructor Array List to hold card objects
     */
    public User(){
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
     * Adds card object to card
     * Add card value to cumulative player total
     */
    public void setHand(Card playerCard) {
        hand.add(playerCard);
        playerTotal=playerTotal+playerCard.getValue();
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
    public void UserShout(){
        System.out.println("Damn it I lost again!!");
    }
}

