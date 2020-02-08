package com.walter.boottrafficsim.model;

import com.walter.boottrafficsim.simulator.Nd;

public class NodePosition {

    private double longitude = 0;
    private double latitude = 0;

    public NodePosition() {

    }

    public NodePosition(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public NodePosition(Nd node) {
        this.latitude=node.getLat();
        this.longitude=node.getLong();
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
