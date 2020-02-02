package com.walter.boottrafficsim.model;

public class RoadSegment {
    PixelPosition pos1;
    PixelPosition pos2;

    public RoadSegment(PixelPosition pos1, PixelPosition pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public PixelPosition getPos1() {
        return pos1;
    }

    public void setPos1(PixelPosition pos1) {
        this.pos1 = pos1;
    }

    public PixelPosition getPos2() {
        return pos2;
    }

    public void setPos2(PixelPosition pos2) {
        this.pos2 = pos2;
    }
}
