module com.first.esgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.first.esgui to javafx.fxml;
    exports com.first.esgui;
}