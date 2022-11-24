module com.yydh.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.yydh.javafx to javafx.fxml;
    exports com.yydh.javafx;
}