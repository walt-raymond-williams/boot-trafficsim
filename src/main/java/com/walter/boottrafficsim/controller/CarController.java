package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.model.NodePosition;
import com.walter.boottrafficsim.model.PixelPosition;
import com.walter.boottrafficsim.simulator.Auto;
import com.walter.boottrafficsim.util.CarsSingleton;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    List<Auto> cars = CarsSingleton.getCars();

    @GetMapping("/carsInfo")
    public List<Auto> allCars(){
        return cars;
    }

    @CrossOrigin
    @GetMapping("/cars")
    public List<PixelPosition> allPos(){
        return CarsSingleton.getCarsPix();
    }


}
