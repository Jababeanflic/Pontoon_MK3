import javafx.scene.image.Image;

/**
 * Pontoon_MK3
 * Dealer object holding dealer cards and hand total
 * Extends User class
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */

public class Dealer extends User{

    DeckOfCards deck = new DeckOfCards();

    public Dealer() {
    }

    /**
     * Polymorphism test method
     */
    public void UserShout(){
        System.out.println("Dealer Looses well done");
    }

    /**
     * @return Card object for player
     */
    public Card drawCard(){
        return deck.drawTopCard();
    }

    public Card playerDrawCard(){
        return deck.drawTopCard();
    }

    public DeckOfCards getDeck() {
        return deck;
    }

    public Image getBackOfCardImage(){
        return deck.getBackOfCardImage();
    }
}


