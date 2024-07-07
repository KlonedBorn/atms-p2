package com.github.klonedev.model.builder;

import java.util.ArrayList;
import java.util.List;

import com.github.klonedev.model.Route;
import com.github.klonedev.model.Station;
import com.github.klonedev.model.TrainSystem;
import com.github.klonedev.model.state.RSStatus;

public class RouteBuilder {
    private Station from;
    private Station to;
    private boolean roundTrip = false;
    private RSStatus status = RSStatus.OPEN;
    private List<Station> stops = new ArrayList<>();
    private final TrainSystem target;

    public RouteBuilder(TrainSystem target) {
        this.target = target;
    }

    public RouteBuilder from(Station from) {
        this.from = from;
        return this;
    }

    public RouteBuilder to(Station to) {
        this.to = to;
        return this;
    }

    public RouteBuilder roundTrip(boolean roundTrip) {
        this.roundTrip = roundTrip;
        return this;
    }

    public RouteBuilder status(RSStatus status) {
        this.status = status;
        return this;
    }

    public RouteBuilder stops(List<Station> stops) {
        this.stops = stops;
        return this;
    }

    public Route build() {
        return null;
    }
}