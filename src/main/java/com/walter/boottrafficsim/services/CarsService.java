package com.walter.boottrafficsim.services;

import com.walter.boottrafficsim.model.NodePosition;
import com.walter.boottrafficsim.model.PixelPosition;
import com.walter.boottrafficsim.simulator.Auto;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    public static List<Auto> cars;
    public static List<PixelPosition> carsPix;


    public static List<PixelPosition> getCarsPix() {
        return carsPix;
    }

    public static void setCarsPix(List<PixelPosition> carsPix) {
        CarsService.carsPix = carsPix;
    }

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
        CarsService.cars = cars;
    }
}
