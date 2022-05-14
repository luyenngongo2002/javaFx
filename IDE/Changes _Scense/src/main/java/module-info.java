module com.example.changesscense {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.changesscense to javafx.fxml;
    exports com.example.changesscense;
}