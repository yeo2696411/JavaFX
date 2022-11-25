package com.yydh.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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

    public static void main(String[] args) {

        try {


            

        } catch (Exception e) {
            e.printStackTrace();
        }

        String url = "myurl"
        String authorizationKey = "Basic {인증키}";
        URL urlObject = null;
        HttpURLConnection con = null;
        StringBuffer response = new StringBuffer();

        try {
            urlObject = new URL(url);
            con = (HttpURLConnection) urlObject.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", authorizationKey);

            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            BufferedReader iny = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String output;

            while ((output = iny.readLine()) != null) {
                response.append(output);
            }
            iny.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            JSONObject json = new JSONObject(response.toString());
            JSONObject dataJsonObject = json.getJSONObject("data");
            lastPage = Integer.valueOf(dataJsonObject.optString("last_page"));
            JSONArray jsonArray = dataJsonObject.getJSONArray("docs");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                FCStockNewsItem item = new FCStockNewsItem();
                item.sTitle_kor = jsonObject.optString("title", "");
                item.content = jsonObject.optString("content","");
//                item.sProffer = sProffer.trim();
//                item.sNews_Seq = sNews_Seq.trim();
//                item.sDate = sDate.trim();
//                item.sTime = sTime.trim();
//                item.sTitle_eng = sTitle_eng.trim();

//                item.sTrans_yn = sTrans_yn.trim();

                itemList.add(item);
            }
            adapter.notifyDataSetChanged();

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}