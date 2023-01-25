package com.aricansoft.matbench;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    @FXML
    protected void runmark(ActionEvent event) throws Exception{
        Calculate.mark();
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("score-view.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("MatBench");
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}