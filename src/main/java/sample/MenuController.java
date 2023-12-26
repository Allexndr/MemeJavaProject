package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private ImageView AnecdotesPhotoButton;

    @FXML
    private ImageView MemesPhotoButton;
    @FXML
    private ImageView arrowBack;
    @FXML
    private ImageView QuotesPhotoButton;

    @FXML
    void initialize() {
        // Set up event handlers for photo buttons
        AnecdotesPhotoButton.setOnMouseClicked(event -> handlePhotoButtonClick("anecdote-page.fxml"));
        MemesPhotoButton.setOnMouseClicked(event -> handlePhotoButtonClick("meme-page.fxml"));
        QuotesPhotoButton.setOnMouseClicked(event -> handlePhotoButtonClick("Quotes.fxml"));
    }

    private void handlePhotoButtonClick(String fxmlFileName) {
        try {
            // подгружает fxml файл
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent root = loader.load();

            // создание новой сцены
            Scene scene = new Scene(root);

            // Get the stage from the source of the event (ImageView)
            Stage stage = (Stage) AnecdotesPhotoButton.getScene().getWindow();

            // Set the scene to the stage
            stage.setScene(scene);

            // показ
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
