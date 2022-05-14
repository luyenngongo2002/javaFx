module com.example.ganme_karo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ganme_karo to javafx.fxml;
    exports com.example.ganme_karo;
    opens sample to javafx.fxml;
}