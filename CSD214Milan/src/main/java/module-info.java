module com.example.csd214milan {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.csd214milan to javafx.fxml;
    exports com.example.csd214milan;
}