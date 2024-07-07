module App {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens com.github.klonedev to javafx.fxml;
    exports com.github.klonedev;
}
