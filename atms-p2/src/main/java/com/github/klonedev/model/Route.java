package com.github.klonedev.model;

import java.util.Set;

import com.github.klonedev.model.state.RSStatus;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SetProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.collections.FXCollections;

public class Route {
    private final ObjectProperty<Station> from = new SimpleObjectProperty<>(this, "Route.from");
    private final ObjectProperty<Station> to = new SimpleObjectProperty<>(this, "Route.to");
    private final BooleanProperty roundTrip = new SimpleBooleanProperty(this, "Route.roundTrip", false);
    private final ObjectProperty<RSStatus> status = new SimpleObjectProperty<>(this, "Route.status");
    private final SetProperty<Station> stops = new SimpleSetProperty<>(this, "Route.stops",
            FXCollections.observableSet());
    private final SetProperty<Segment> path = new SimpleSetProperty<>(this, "Route.path",
            FXCollections.observableSet());

    public Route(Station from, Station to, boolean roundTrip, RSStatus status, Set<Station> stops, Set<Segment> path) {
        setFrom(from);
        setTo(to);
        setRoundTrip(roundTrip);
        setStatus(status);
        getStops().addAll(stops);
        getPath().addAll(path);
    }

    public Station getFrom() {
        return from.get();
    }

    public void setFrom(Station from) {
        this.from.set(from);
    }

    public Station getTo() {
        return to.get();
    }

    public void setTo(Station to) {
        this.to.set(to);
    }

    public boolean isRoundTrip() {
        return roundTrip.get();
    }

    public void setRoundTrip(boolean roundTrip) {
        this.roundTrip.set(roundTrip);
    }

    public RSStatus getStatus() {
        return status.get();
    }

    public void setStatus(RSStatus status) {
        this.status.set(status);
    }

    public Set<Station> getStops() {
        return stops.get();
    }

    public SetProperty<Station> stopsProperty() {
        return stops;
    }

    public Set<Segment> getPath() {
        return path.get();
    }

    public SetProperty<Segment> pathProperty() {
        return path;
    }
}