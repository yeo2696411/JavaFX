package com.yydh.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private Button rankingBtn;
    public void changeScene() throws IOException {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("Rank.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) rankingBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button guideBtn;
    public void guideScene() throws IOException {
        try {
            Parent nextScene
                    = FXMLLoader.load(getClass().getResource("Guide.fxml"));
            Scene scene = new Scene(nextScene);

            Stage primaryStage = (Stage) guideBtn.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
