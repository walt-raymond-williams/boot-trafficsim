package com.walter.boottrafficsim.util;

import com.walter.boottrafficsim.simulator.Auto;

import java.util.List;

public class CarsSingleton {
    public static List<Auto> cars;

    public static List<Auto> getCars() {
        return cars;
    }

    public static void setCars(List<Auto> cars) {
        CarsSingleton.cars = cars;
    }
}
