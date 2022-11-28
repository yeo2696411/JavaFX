package com.yydh.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1020);
        stage.setTitle("ER.GG");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {













        launch();
    }


}

