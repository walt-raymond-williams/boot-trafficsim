package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.simulator.Renderer;
import com.walter.boottrafficsim.util.RendererSingleton;
import org.springframework.web.bind.annotation.*;

@RestController
public class FocusController {

    @CrossOrigin
    @PostMapping("/offset")
    public void setOffset(@RequestParam("x") String x,@RequestParam("y") String y){
        System.out.println("am i here:  x:"+x+" y:"+y);

        int xint = Integer.parseInt(x);
        int yint = Integer.parseInt(y);
        System.out.println("am i hereAFTER:  x:"+xint+" y:"+yint);



        RendererSingleton.getRenderer().setMouseOffSetX(RendererSingleton.getRenderer().getMouseOffSetX()+xint);
        RendererSingleton.getRenderer().setMouseOffSetY(RendererSingleton.getRenderer().getMouseOffSetY()+yint);
        RendererSingleton.getRenderer().setMap();
//

    }


}
