package com.aricansoft.matbench;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScoreController {
    @FXML Label scorelabel;

    @FXML
    protected void showscore(ActionEvent event){
        scorelabel.setText(Calculate.getScore());
    }

}