package com.github.klonedev;

import com.github.fxrouter.FXRouter;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Entry point to JavaFX Application.
 */
public class App extends Application {

    @Override
    public void start(Stage primary) throws Exception {
        FXRouter.bind(this, primary, "Railway ATMS", 1280, 720);
        FXRouter.when("design", "page/design.fxml");
        FXRouter.goTo("design");
    }

    public static void main(String[] args) {
        launch(args);
    }
}