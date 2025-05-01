module com.patterns.patterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.patterns.patterns to javafx.fxml;
    exports com.patterns.patterns;
}