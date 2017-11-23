package javafxapplication5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Intro extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication5/Intro.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setMinWidth(800);
            primaryStage.setMinHeight(600);
            primaryStage.setTitle("Intoduction");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {

        }
    }
}
