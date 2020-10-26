/**
 * Pontoo_MK2
 * Player object holding player cards and hand total
 * Extends User class
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Player extends User {

    private String Name;

    public Player(String pName) {
        this.Name = pName;
    }

    public String getName() {
        return Name;
    }

    /**
     * @return Card object for player
     * card is printed to screen
     */
    /*
    public Card drawCard(){
        Card newCard = aDeck.drawTopCard();
        System.out.println("You drew "+newCard);
        return newCard;
    }

     */
}


