/**
 * Pontoo_MK2
 * Dealer object holding dealer cards and hand total
 * Extends User class
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */

public class Dealer extends User{

    DeckOfCards Deck = new DeckOfCards();

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
        return Deck.drawTopCard();
    }

    public Card playerDrawCard(){
        Card newCard = Deck.drawTopCard();
        System.out.println("You drew "+newCard);
        return newCard;
    }
}


