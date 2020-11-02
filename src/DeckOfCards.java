import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.image.Image;

/**
 * Pontoon_MK2
 * Creates a deck of card objects, set to standard 52 card deck
 * Custom deck can be created using overloaded constructor
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class DeckOfCards {

    private ArrayList<Card> deck;
    private Image backOfCardImage;
    private Card nCard = new Card();

    /**
     * No arguments passed in, so creates standard deck of cards
     */
    public DeckOfCards() {

        List<Suits> suits = nCard.getValidSuit();
        List<FaceNames> faceNames = nCard.getValidFaceNames();

        deck = new ArrayList<>();

        for (Suits suit : suits) {
            for (FaceNames faceName : faceNames)
                deck.add(new Card(faceName, suit));
        }
        Collections.shuffle(deck);
        backOfCardImage = new Image("./images/backOfCard.png");
    }

    /**
     * This passes in a specific collection of cards
     *
     * @param deck
     */
    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
        backOfCardImage = new Image("./images/backOfCard.png");
    }

    /**
     * @return Image back of card
     */
    public Image getBackOfCardImage() {
        return backOfCardImage;
    }


    /**
     * Deal top card and remove from deck
     */
    public Card drawTopCard() {
        if (deck.size() > 0)
            return deck.remove(0);
        else
            return null;
    }

    /**
     * Shuffle deck of cards
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }
}

