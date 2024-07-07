package com.github.klonedev.view;

import com.github.klonedev.model.Station;

import javafx.scene.layout.Region;

public class StationView extends Region {

    private final Station model;

    private StationView(Station model) {
        this.model = model;
    }

    public Station getModel() {
        return model;
    }

    public static StationView create(Station model) {
        return new StationView(model);
    }
}
