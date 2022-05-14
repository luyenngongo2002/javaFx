module com.example.video2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.video2 to javafx.fxml;
    exports com.example.video2;
}