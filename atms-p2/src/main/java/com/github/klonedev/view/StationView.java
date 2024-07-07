package com.github.klonedev.view;

import com.github.klonedev.model.Station;
import com.github.klonedev.settings.Constants;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class StationView extends VBox {

    private final Station model;
    private Circle marker = new Circle();
    private Label label = new Label();

    private StationView(Station model) {
        this.model = model;
        applyStyling();
        applyBindings();
    }

    private void applyStyling() {
        marker.setStroke(Color.SILVER);
        marker.setFill(Color.WHITE);
        marker.setStrokeWidth(3.5);
        marker.setRadius(Constants.DEFAULT_MARKER_RADIUS);
        label.setFont(Font.font("Arial", 12));
        label.setTextFill(Color.WHITE);
        getChildren().addAll(marker, label);
    }

    private void applyBindings() {
        layoutXProperty().bind(model.positionXProperty().subtract(marker.layoutXProperty()));
        layoutYProperty().bind(model.positionYProperty().subtract(marker.layoutYProperty()));
        label.textProperty().bind(model.nameProperty());
    }

    public Station getModel() {
        return model;
    }

    public static StationView create(Station model) {
        return new StationView(model);
    }
}