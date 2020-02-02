package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.model.RoadSegment;
import com.walter.boottrafficsim.simulator.Road;
import com.walter.boottrafficsim.util.MapSingleton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapController {
    private List<List<RoadSegment>> roads = MapSingleton.getRoadSegments();

    @GetMapping("/map")
    public List<List<RoadSegment>> getRoads(){
        System.out.println("getRoads");
        return roads;
    }


    @GetMapping("/mapTest")
    public List<RoadSegment> getRoadsTest(){
//        System.out.println("getRoads "+ roads.size() );
//        for(List<RoadSegment> li : roads){
//            for(RoadSegment r : li){
//                System.out.println(r.getPos1().getX()+" " + r.getPos2().getY());
//            }
//        }
        return roads.get(0);
    }



}
