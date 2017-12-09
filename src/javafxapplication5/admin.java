package javafxapplication5;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author sardor allaberganov
 */

public class admin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication5/admin.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setMinWidth(800);
            primaryStage.setMinHeight(600);
            primaryStage.setTitle("Admin");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {

        }
    }

    @FXML
    public void goIntro(Event event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
}