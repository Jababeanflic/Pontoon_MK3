import java.util.Scanner;

public class TurnController {

    Scanner kboard = new Scanner(System.in);

    public TurnController() {
    }

    public boolean getResult(int total, int dealer) {
        return total > dealer && total <= 21;
    }

    /**
     * @param total int total
     * @return boolean
     * If total is over 21 false returned under 21 true
     */
    public boolean busted(int total) {
        return total > 21;
    }
}
