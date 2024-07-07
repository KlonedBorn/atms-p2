package com.github.klonedev.view;

import com.github.klonedev.model.Segment;
import com.github.klonedev.settings.Constants;

import javafx.beans.binding.Bindings;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;

public class SegmentView extends Line {

    private Segment model;

    private SegmentView(Segment model) {
        this.model = model;
        applyStyling();
        attachBindings();
    }

    private void applyStyling() {
        setStroke(Color.SILVER);
        setStrokeWidth(Constants.DEFAULT_SEGMENT_WIDTH);
        setStrokeLineCap(StrokeLineCap.ROUND);
        setOpacity(0.8);
    }

    private void attachBindings() {
        startXProperty().bind(Bindings.when(
                model.firstProperty().isNotNull()).then(model.getFirst().positionXProperty()).otherwise(0.0));
        startYProperty().bind(Bindings.when(
                model.firstProperty().isNotNull()).then(model.getFirst().positionYProperty()).otherwise(0.0));
        endXProperty().bind(Bindings.when(
                model.secondProperty().isNotNull()).then(model.getSecond().positionXProperty()).otherwise(0.0));
        endYProperty().bind(Bindings.when(
                model.secondProperty().isNotNull()).then(model.getSecond().positionYProperty()).otherwise(0.0));
    }

    public static SegmentView create(Segment segment) {
        if (segment == null) {
            return null;
        }
        return new SegmentView(segment);
    }
}