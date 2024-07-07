package com.github.klonedev.model.builder;

import com.github.klonedev.model.Station;
import com.github.klonedev.model.TrainSystem;
import com.github.klonedev.model.state.RSStatus;
import com.github.klonedev.model.Segment;

public class SegmentBuilder {
    private Station from;
    private Station to;
    private RSStatus status = RSStatus.OPEN;
    private TrainSystem target;

    public SegmentBuilder(TrainSystem target) {
        this.target = target;
    }

    public SegmentBuilder from(Station from) {
        this.from = from;
        return this;
    }

    public SegmentBuilder to(Station to) {
        this.to = to;
        return this;
    }

    public SegmentBuilder status(RSStatus status) {
        this.status = status;
        return this;
    }

    public Segment build() {
        Segment created = new Segment(from, to, status);
        target.getSegments().add(created);
        return created;
    }
}
