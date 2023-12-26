package sample;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnecdotesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ImageView arrowBack;
    @FXML
    private Text AnecdoteTextField;

    @FXML
    private Button GenerateAnecdoteButton;

    // Map of anecdotes
    private Map<String, String> anecdotes;

    @FXML
    void initialize() {
        assert AnecdoteTextField != null : "fx:id=\"AnecdoteTextField\" was not injected: check your FXML file 'Anecdotes.fxml'.";
        assert GenerateAnecdoteButton != null : "fx:id=\"GenerateAnecdoteButton\" was not injected: check your FXML file 'Anecdotes.fxml'.";
        initializeAnecdotesMap();
    }

    private void initializeAnecdotesMap() {
        anecdotes = new HashMap<>();
        anecdotes.put("Anecdote1Key", "В Москве задержали программиста, который с огромной скоростью писал абсолютно не читаемый код.\n" +
                "\n" +
                "Он отказался от комментариев");
        anecdotes.put("Anecdote2Key", "— У какого животного 5 ног?\n" +
                                    "— У питбуля, бегущего с детской площадки.");
        anecdotes.put("Anecdote3Key", "Чем дети каннибалов играют в песочнице?\n" +
                "\n" +
                "Чужими лопатками");
        // Add more anecdotes as needed
    }

    // Generate a random anecdote key and set it to the AnecdoteTextField
    @FXML
    private void generateAnecdote() {
        Random random = new Random();
        int index = random.nextInt(anecdotes.size());
        String randomAnecdoteKey = (String) anecdotes.keySet().toArray()[index];
        String randomAnecdote = anecdotes.get(randomAnecdoteKey);
        AnecdoteTextField.setText(randomAnecdote);
    }
    @FXML
    private void switchToMenuScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Menu.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
