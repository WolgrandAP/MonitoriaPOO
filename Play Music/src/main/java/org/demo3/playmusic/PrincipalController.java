package org.demo3.playmusic;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrincipalController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
