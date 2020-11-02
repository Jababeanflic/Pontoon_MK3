import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Pontoon_MK3
 * Main method
 * @author 18025316
 * Scott Kinsmnan
 * 30/10/2020
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("DeckView.fxml"));
        root.setStyle("-fx-background-color: GREEN;");
        Scene scene = new Scene(root);

        primaryStage.setTitle("Pontoon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
