package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.File;
import java.util.Random;

public class MemeController {

    @FXML
    private Button GenerateMemeButton;

    @FXML
    private Text MemeText;

    @FXML
    private ImageView memeImageView;


    private static final String MEME_FOLDER_PATH = "C:/Users/sacha/Downloads/Telegram Desktop/Meme2/Meme/src/main/java/sample/assets/meme/meme";

    private static final String[] MEME_SUBTITLES = {
            "Average iitu student day",
            "Не надо были поступать на it...",
            "А что вы хотели, Казахстан!",
            // Добавьте здесь свои подписи
    };

    @FXML
    void generateMeme(ActionEvent event) {
        // Получаем список файлов из папки с мемами
        File memeFolder = new File(MEME_FOLDER_PATH);
        File[] memeFiles = memeFolder.listFiles();

        if (memeFiles != null && memeFiles.length > 0) {
            // Выбираем случайный файл из списка
            Random random = new Random();
            File randomMemeFile = memeFiles[random.nextInt(memeFiles.length)];

            // Создаем изображение и устанавливаем его в ImageView
            Image memeImage = new Image(randomMemeFile.toURI().toString());
            memeImageView.setImage(memeImage);

            // Выбираем случайную подпись и устанавливаем ее в MemeText
            String randomSubtitle = MEME_SUBTITLES[random.nextInt(MEME_SUBTITLES.length)];

            // Устанавливаем рандомный текст в MemeText
            MemeText.setText(randomSubtitle);
        }
    }



    @FXML
    void initialize() {
        assert GenerateMemeButton != null : "fx:id=\"GenerateMemeButton\" was not injected: check your FXML file 'meme-page.fxml'.";
        assert memeImageView != null : "fx:id=\"memeImageView\" was not injected: check your FXML file 'meme-page.fxml'.";
    }
}
