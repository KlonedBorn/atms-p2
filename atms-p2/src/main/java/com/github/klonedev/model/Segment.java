package com.github.klonedev.model;

import com.github.klonedev.model.state.RSStatus;
import com.github.klonedev.view.SegmentView;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Segment {
    private final ObjectProperty<Station> first = new SimpleObjectProperty<>(this, "Segment.first");
    private final ObjectProperty<Station> second = new SimpleObjectProperty<>(this, "Segment.second");
    private final ObjectProperty<RSStatus> status = new SimpleObjectProperty<>(this, "Segment.status");
    private final StringProperty name = new SimpleStringProperty(this, "Segment.name", "");
    private final SegmentView view = SegmentView.create(this);

    public Segment(Station first, Station second, RSStatus status) {
        this.first.set(first);
        this.second.set(second);
        this.status.set(status);
    }

    public Station getFirst() {
        return first.get();
    }

    public void setFirst(Station first) {
        this.first.set(first);
    }

    public ObjectProperty<Station> firstProperty() {
        return first;
    }

    public Station getSecond() {
        return second.get();
    }

    public void setSecond(Station second) {
        this.second.set(second);
    }

    public ObjectProperty<Station> secondProperty() {
        return second;
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

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public SegmentView getView() {
        return view;
    }
}
