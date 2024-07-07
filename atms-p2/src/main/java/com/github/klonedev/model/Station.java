package com.github.klonedev.model;

import com.github.klonedev.model.state.RSStatus;
import com.github.klonedev.view.StationView;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Station  {
    private final StringProperty name = new SimpleStringProperty(this, "Station.name", "");
    private final ObjectProperty<RSStatus> status = new SimpleObjectProperty<>(this, "Station.status",
            RSStatus.OPEN);
    private final DoubleProperty positionX = new SimpleDoubleProperty(this, "Station.positionX");
    private final DoubleProperty positionY = new SimpleDoubleProperty(this, "Station.positionY");
    private final StationView view = StationView.create(this);

    public Station() {
    }

    public Station(String name, RSStatus status, double positionX, double positionY) {
        setPositionX(positionX);
        setPositionY(positionY);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public RSStatus getStatus() {
        return status.get();
    }

    public void setStatus(RSStatus status) {
        this.status.set(status);
    }

    public ObjectProperty<RSStatus> statusProperty() {
        return status;
    }

    public double getPositionX() {
        return positionX.get();
    }

    public DoubleProperty positionXProperty() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX.set(positionX);
    }

    public double getPositionY() {
        return positionY.get();
    }

    public DoubleProperty positionYProperty() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY.set(positionY);
    }

    public StationView getView() {
        return view;
    }
}
