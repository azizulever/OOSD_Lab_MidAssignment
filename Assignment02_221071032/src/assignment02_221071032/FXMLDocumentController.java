/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment02_221071032;

import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author N0Hel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button Button3;
    @FXML
    private Button Button2;
    @FXML
    private Button Button4;
    @FXML
    private Button Button1;
    @FXML
    private Button Exit;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("Clicked Button 3");
        label.setText("Clicked Button 3");
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("Clicked Button 2");
        label.setText("Clicked Button 2");
    }

    @FXML
    private void handleButtonAction4(ActionEvent event) {
        System.out.println("Clicked Button 4");
        label.setText("Clicked Button 4");
    }

    @FXML
    private void handleButtonAction1(ActionEvent event) {
        System.out.println("Clicked Button 1");
        label.setText("Clicked Button 1");
    }

    @FXML
    private void handleButtonAction5(ActionEvent event) {
        System.out.println("Exited");
        label.setText("Exiting");
        Stage stage = (Stage) Exit.getScene().getWindow();
        stage.close();
    }
    
}
