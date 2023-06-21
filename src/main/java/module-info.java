module com.example.messengerserverclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerserverclient to javafx.fxml;
    exports com.example.messengerserverclient;
}