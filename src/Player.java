/**
 * Pontoon_MK3
 * Player object holding player cards and hand total
 * Extends User class
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */
public class Player extends User {

    private String Name;

    public Player(String pName) {
        this.Name = pName;
    }

    public String getName() {
        return Name;
    }
}


