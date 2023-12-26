module com.example.meme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;
    requires java.sql;

    opens sample to javafx.fxml;
    exports sample;
}