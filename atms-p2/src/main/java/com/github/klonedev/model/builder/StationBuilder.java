package com.github.klonedev.model.builder;

import com.github.javafaker.Faker;
import com.github.klonedev.model.Station;
import com.github.klonedev.model.TrainSystem;
import com.github.klonedev.model.state.RSStatus;

public class StationBuilder {
    private final Faker faker = new Faker();
    private String name = faker.address().streetName();
    private RSStatus status = RSStatus.OPEN;
    private double positionX = 0.0;
    private double positionY = 0.0;
    private final TrainSystem target;

    public StationBuilder(TrainSystem target) {
        this.target = target;
    }

    public StationBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StationBuilder status(RSStatus status) {
        this.status = status;
        return this;
    }

    public StationBuilder at(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        return this;
    }

    public Station build() {
        Station created = new Station(name, status, positionX, positionY);
        target.getStations().add(created);
        return created;
    }
}