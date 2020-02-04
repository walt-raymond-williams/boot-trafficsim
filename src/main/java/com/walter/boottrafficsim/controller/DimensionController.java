package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.util.DimensionSingleton;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DimensionController {

    @CrossOrigin
    @GetMapping("/dimensions")
    public int[] getDimensions(){
        for(int i : DimensionSingleton.getDimensions()){
//            System.out.println("*dimensions: "+i);
        }
        return DimensionSingleton.getDimensions();
    }
}
