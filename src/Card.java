import java.util.Arrays;
import java.util.List;

/**
 * Pontoo_MK2
 * Card class creates individual card objects with a face name, suit and value
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Card {

    private FaceNames faceName;
    private Suits suit;
    private int value;
    // private Image image;


    /**
     * @param faceName String facename
     * @param suit String suit
     */
    public Card(FaceNames faceName, Suits suit) {
        setFaceName(faceName);
        setSuit(suit);
        setValueEnum();
    }

    public Card() {

    }

    public FaceNames getFaceName() {
        return faceName;
    }

    /**
     * List of face names
     * @return
     */
    public List<FaceNames> getValidFaceNames(){
        return Arrays.asList(FaceNames.values());
    }

    /**
     * @param faceName valid face names
     * validates and sets facename
     */
    public void setFaceName(FaceNames faceName) {
            this.faceName = faceName;
    }

    public Suits getSuit() {
        return suit;
    }

    /**
     * List of suits
     * @return Array List String of suits
     */
    public List<Suits> getValidSuit(){
        return Arrays.asList(Suits.values());
    }

    /**
     * @param suit String suit
     * Validates and sets suit
     */
    public void setSuit(Suits suit) {
        List<Suits> validSuits = getValidSuit();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Not a valid suit, valid suits are " +validSuits);
    }

    public int getValue() {
       return value;
    }

    /**
     * Sets a value depending on face name
     * Parses any String numbers to ints or converts named cars to correct value
     * @param
     */
    public void setValueEnum(){
        String face = faceName.toString();
        FaceNames f = FaceNames.valueOf(face);
        value = f.getValue();
    }

    /**
     * @return String with face name, suit and value
     */
    public String toString(){
        return String.format(faceName+" of " +suit+ " Value: " +value);
    }
}
