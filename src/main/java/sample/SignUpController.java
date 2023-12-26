package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField signUpContry;

    @FXML
    private TextField signUpLastname;

    @FXML
    private TextField signUpName;

    @FXML
    void initialize() {
        // Set up event handler for the SignUpButton
//        SignUpButton.setOnAction(event -> signUpButtonClicked());
    }

    // Event handler method for SignUpButton
    @FXML
    void signUpButtonClicked(ActionEvent actionEvent) {
        JavaPostgreSql.writeToDatabase(login_field.getText(), password_field.getText(), signUpContry.getText(), login_field.getText(), signUpLastname.getText());
    }
}
