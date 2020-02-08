package com.walter.boottrafficsim.services;

import com.walter.boottrafficsim.model.RoadSegment;
import com.walter.boottrafficsim.simulator.Road;

import java.util.List;

public class MapService {
    public static List<Road> roads;
    public static List<List<RoadSegment>> roadSegments;

    public static List<List<RoadSegment>> getRoadSegments() {
        return roadSegments;
    }

    public static void setRoadSegments(List<List<RoadSegment>> roadSegments) {
        MapService.roadSegments = roadSegments;

        System.out.println(roadSegments.size());
    }

    public static List<Road> getRoads(){
        return roads;
    }

    public static void setRoads(List<Road> roads) {
        MapService.roads = roads;
    }
}
