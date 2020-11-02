/**
 * Pontoon_MK3
 *
 * !!!!!!!!!!!! This class is currently not implemented !!!!!!!!!!!!!!!
 *
 * Statistics class calculates to percentage og games one
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */
public class Statistics {

    /**
     * @param gamesWon ,
     * @param gamesPlayed ,
     */
    public void statistic(int gamesWon, int gamesPlayed) { // Method to calculate win percent

        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Games won: " + gamesWon);
        int winPercent = gamesWon * 100 / gamesPlayed;
        System.out.println("Percentage of games won: " + winPercent + "%");
    }// end method

    /**
     * print out each card and the number of times it was drawn
     * loops number of times equal to length of cards drawn array so 10
     * @param cardsDrawn  ,
     */
    public static void totalCards(int[][] cardsDrawn) {

        System.out.println("Frequency of each card drawn");

        for (int i = 1; i < cardsDrawn.length; i++) {
            System.out.println("Number of time card number " + i + " was drawn: " + cardsDrawn[i][0]);
        }
        System.out.println();
    }// end method

    /**
     * @param cardsDrawn current cards in player hand
     * @param totalCardsDrawn all cards that have been in player hand
     * @return  total card drawn 2d array, first index is card number second number of time that card was drawn
     */
    public static int[][] cardsDrawn(int[] cardsDrawn, int[][] totalCardsDrawn)
    {
        System.out.print("Cards drawn: ");
        for (int x = 0; x < 10; x++) {
            if (cardsDrawn[x] != 0)
                if (x == 0)
                    System.out.print(cardsDrawn[x]);
                else {
                    System.out.print("," + cardsDrawn[x]);
                }
            totalCardsDrawn[cardsDrawn[x]][0] = totalCardsDrawn[cardsDrawn[x]][0] + 1;
        } // add new card to total cards drawn count x=the card that was drawn and +1 is added to the "2nd array"

        System.out.println();
        return (totalCardsDrawn);
    } // end method
}
