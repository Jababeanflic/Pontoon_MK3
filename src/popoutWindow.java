import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Pontoon_MK3
 * Creates a pop out window displaying the results of the game
 * Player must acknowledge wind to continue
 * Should be static?
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */

public class popoutWindow {

    /**
     * class to be redefined on each call so static is appropriate
     *
     * @param title   String sets the title of the window
     * @param message String message to be displayed in window
     * @param pTotal  int part of displayed message (player total)
     * @param dTotal  int part of displayed message (dealer total)
     */
    public void display(String title, String message, int pTotal, int dTotal) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        Label label1 = new Label();
        label.setText(message);
        label1.setText("You have: " + pTotal + " Dealer has: " + dTotal);
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, label1, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
}
