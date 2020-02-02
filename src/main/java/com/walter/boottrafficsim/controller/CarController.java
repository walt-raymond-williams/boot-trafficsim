package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.simulator.Auto;
import com.walter.boottrafficsim.util.CarsSingleton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {
    List<Auto> cars = CarsSingleton.getCars();

    @GetMapping("/cars")
    public List<Auto> allCars(){
        return cars;
    }
}