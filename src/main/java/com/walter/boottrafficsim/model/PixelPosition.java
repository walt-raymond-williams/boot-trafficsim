package com.walter.boottrafficsim.model;

public class PixelPosition {
    private int x;
    private int y;

    public PixelPosition(double x, double y) {
        this.x = (int)x;
        this.y = (int)y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = (int)x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = (int)y;
    }
}
