    package sample;

    import java.io.IOException;
    import java.net.URL;
    import java.util.Objects;
    import java.util.ResourceBundle;

    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.PasswordField;
    import javafx.scene.control.TextField;
    import javafx.scene.image.ImageView;
    import javafx.stage.Stage;

    public class LoginController {

        private Stage stage;
        private Scene scene;
        private Parent root;


        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;
        @FXML
        private ImageView arrowBack;
        @FXML
        private Button authSignInButton;

        @FXML
        private Button loginSignUpButton;

        @FXML
        private TextField login_field;

        @FXML
        private PasswordField password_field;
        @FXML
        public void switchToMenu(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Menu.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        public void switchToSignUpScene(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("singUp.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }