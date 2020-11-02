import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;

/**
 * Pontoon_MK3
 * Card class creates individual card objects with a face name, suit and value
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */
public class Card {

    private FaceNames faceName;
    private Suits suit;
    private int value;
    private Image image;

    public Card() {
    }

    /**
     * Constructor
     * @param faceName String facename
     * @param suit     String suit
     */
    public Card(FaceNames faceName, Suits suit) {
        setFaceName(faceName);
        setSuit(suit);
        setValueEnum();

        String fileName = cardToString(faceName, suit);
        image = new Image("./images/" + fileName);
    }

    /**
     * List of face names
     * @return Array List containing face names
     */
    public List<FaceNames> getValidFaceNames() {
        return Arrays.asList(FaceNames.values());
    }

    /**
     * @param faceName valid face names
     * validates and sets face name
     */
    public void setFaceName(FaceNames faceName) {
        this.faceName = faceName;
    }

    /**
     * List of suits
     * @return Array List of suits
     */
    public List<Suits> getValidSuit() {
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
            throw new IllegalArgumentException("Not a valid suit, valid suits are " + validSuits);
    }

    /**
     * @return int card value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets a value depending on face name
     * Parses any String numbers to ints or converts named cars to correct value
     */
    public void setValueEnum() {
        String face = faceName.toString();
        FaceNames f = FaceNames.valueOf(face);
        value = f.getValue();
    }

    /**
     * @return image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Converts card facename and suit to string
     * @return String with face name, suit and value of card
     */
    public String toString() {
        return String.format(faceName + " of " + suit + " Value: " + value);
    }

    /**
     * @param faceName face name from enum
     * @param suit suit from enum
     * @return String with face name, suit and makes image file name for that card
     */
    public String cardToString(FaceNames faceName, Suits suit) {
        String faceToString = faceName.toString();
        String suitsToString = suit.toString();
        return faceToString + "_of_" + suitsToString + ".png";
    }
}
