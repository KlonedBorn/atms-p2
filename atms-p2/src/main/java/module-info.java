module App {
    requires javafaker;
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.management;
    requires java.desktop;
    requires javafx.base;

    opens com.github.klonedev to javafx.fxml;
    opens com.github.klonedev.controller to javafx.fxml;

    exports com.github.klonedev;
    exports com.github.klonedev.controller;
}
