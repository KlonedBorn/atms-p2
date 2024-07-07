module com.github.klonedev {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.klonedev to javafx.fxml;
    exports com.github.klonedev;
}
