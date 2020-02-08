package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.services.DimensionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DimensionController {

    @CrossOrigin
    @GetMapping("/dimensions")
    public int[] getDimensions(){
        for(int i : DimensionService.getDimensions()){
//            System.out.println("*dimensions: "+i);
        }
        return DimensionService.getDimensions();
    }
}
