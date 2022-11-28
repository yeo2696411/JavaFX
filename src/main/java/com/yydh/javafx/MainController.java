package com.yydh.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpResponse;
import java.util.ResourceBundle;
import java.net.http.HttpClient;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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