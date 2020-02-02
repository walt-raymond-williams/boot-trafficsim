package com.walter.boottrafficsim.util;

import com.walter.boottrafficsim.model.NodePosition;
import com.walter.boottrafficsim.simulator.Auto;

import java.util.ArrayList;
import java.util.List;

public class CarsSingleton {
    public static List<Auto> cars;

    public static List<Auto> getCars() {
        return cars;
    }

    public static List<NodePosition> getPositions(){
        List<NodePosition> list = new ArrayList();
        for(Auto a : cars){
            list.add(new NodePosition(a.getPos()));
        }

        return list;
    }

    public static void setCars(List<Auto> cars) {
        CarsSingleton.cars = cars;
    }
}
