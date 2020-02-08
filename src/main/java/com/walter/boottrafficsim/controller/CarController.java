package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.model.NodePosition;
import com.walter.boottrafficsim.model.PixelPosition;
import com.walter.boottrafficsim.services.RendererService;
import com.walter.boottrafficsim.services.SimulationService;
import com.walter.boottrafficsim.simulator.Auto;
import com.walter.boottrafficsim.services.CarsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    List<Auto> cars = CarsService.getCars();

    @GetMapping("/carsInfo")
    public List<Auto> allCars(){
        return cars;
    }

    @CrossOrigin
    @GetMapping("/cars")
    public List<PixelPosition> allPos(){
        return CarsService.getCarsPix();
    }

    @CrossOrigin
    @GetMapping("/findcar")
    public Auto findCar(@RequestParam("x") String x, @RequestParam("y") String y){
        System.out.println("did i get to /findcar");
        double xint = Double.parseDouble(x);
        double yint = Double.parseDouble(y);
        NodePosition np = RendererService.getRenderer().getLatLong(xint,yint);
        Auto result = SimulationService.getSim().findAuto(np.getLongitude(), np.getLatitude());
        System.out.println("found ref: "+result.getPos().getRef());
        return result;

//        return null;
    }

}
