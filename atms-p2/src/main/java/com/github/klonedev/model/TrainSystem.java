package com.github.klonedev.model;

import java.util.HashSet;
import java.util.Set;

import com.github.klonedev.model.builder.RouteBuilder;
import com.github.klonedev.model.builder.SegmentBuilder;
import com.github.klonedev.model.builder.StationBuilder;

public class TrainSystem {
    private double mapWidth = 0.0;
    private double mapHeight = 0.0;
    private final Set<Station> stations = new HashSet<>();
    private final Set<Segment> segments = new HashSet<>();
    private final Set<Route> routes = new HashSet<>();

    public TrainSystem(double mapWidth, double mapHeight) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
    }

    public RouteBuilder routeBuilder() {
        return new RouteBuilder(this);
    }

    public SegmentBuilder segmentBuilder() {
        return new SegmentBuilder(this);
    }

    public StationBuilder stationBuilder() {
        return new StationBuilder(this);
    }

    public double getMapWidth() {
        return mapWidth;
    }

    public double getMapHeight() {
        return mapHeight;
    }

    public Set<Station> getStations() {
        return stations;
    }

    public Set<Segment> getSegments() {
        return segments;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}