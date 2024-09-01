/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment03_221071032;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author N0Hel
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private RadioButton otherRadioButton;

    @FXML
    private ToggleGroup genderGroup;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Get the values from the fields
        String username = usernameField.getText();
        String password = passwordField.getText();
        String gender = ((RadioButton) genderGroup.getSelectedToggle()).getText();

        // Print the details to the console
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
