/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author sardor allaberganov
 */
public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
        Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication5/flightPlanning.fxml"));
        Scene scene = new Scene(root);
        Screen screen = Screen.getPrimary();
        javafx.geometry.Rectangle2D bounds = screen.getVisualBounds();
        
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        primaryStage.setTitle("Flight Planning");
        primaryStage.setScene(scene);
        primaryStage.show();
        
            } catch (IOException e) {
        }
    }
    @FXML
    private ToggleGroup groupFlight = new ToggleGroup();
    @FXML RadioButton one_way = new RadioButton();
    @FXML RadioButton round_trip = new RadioButton();
    @FXML DatePicker retDate = new DatePicker();
    @FXML DatePicker depDate = new DatePicker();
    
    public void initialize() {
        depDate.setEditable(false);
        retDate.setEditable(false);
        round_trip.setSelected(true);
        round_trip.setToggleGroup(groupFlight);
        one_way.setToggleGroup(groupFlight);
    }
      @FXML
    public void nextButton(Event event) throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("personalDetails.fxml"));
    Scene scene = new Scene(root);
    
    Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    stage.hide();
    stage.setScene(scene);
    stage.show();
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
    
}
