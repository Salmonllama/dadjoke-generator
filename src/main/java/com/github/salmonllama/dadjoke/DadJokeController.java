package com.github.salmonllama.dadjoke;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DadJokeController implements Initializable {

    @FXML
    private Label jokeLbl;

    @FXML
    private Button newJokeBtn;

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        try {
            jokeLbl.setText(DadJoke.getJoke());
        } catch (IOException e) {
            jokeLbl.setText("An error occurred, please try again");
        }

        newJokeBtn.setOnAction(ae -> {
            try {
                jokeLbl.setText(DadJoke.getJoke());
            } catch (IOException e) {
                jokeLbl.setText("An error occurred, please try again");
            }
        });
    }
}
