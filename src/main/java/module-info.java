module com.yydh.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires java.net.http;


    opens com.yydh.javafx to javafx.fxml;
    exports com.yydh.javafx;
}