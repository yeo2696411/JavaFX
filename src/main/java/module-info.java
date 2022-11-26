module com.yydh.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.yydh.javafx to javafx.fxml;
    exports com.yydh.javafx;
}