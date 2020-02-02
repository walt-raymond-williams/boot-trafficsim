package com.walter.boottrafficsim.util;

import com.walter.boottrafficsim.model.RoadSegment;
import com.walter.boottrafficsim.simulator.Road;

import java.util.List;

public class MapSingleton {
    public static List<Road> roads;
    public static List<List<RoadSegment>> roadSegments;

    public static List<List<RoadSegment>> getRoadSegments() {
        return roadSegments;
    }

    public static void setRoadSegments(List<List<RoadSegment>> roadSegments) {
        MapSingleton.roadSegments = roadSegments;

        System.out.println(roadSegments.size());
    }

    public static List<Road> getRoads(){
        return roads;
    }

    public static void setRoads(List<Road> roads) {
        MapSingleton.roads = roads;
    }
}
