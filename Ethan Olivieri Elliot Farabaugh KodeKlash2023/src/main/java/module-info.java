module com.example.kodeklash2023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.kodeklash2023 to javafx.fxml;
    exports com.example.kodeklash2023;
}