package com.walter.boottrafficsim.controller;

import com.walter.boottrafficsim.services.RendererService;
import org.springframework.web.bind.annotation.*;

@RestController
public class FocusController {

    @CrossOrigin
    @PostMapping("/offset")
    public void setOffset(@RequestParam("x") String x,@RequestParam("y") String y){
        System.out.println("am i here:  x:"+x+" y:"+y);

        int xint = Integer.parseInt(x);
        int yint = Integer.parseInt(y);
//        System.out.println("am i hereAFTER:  x:"+xint+" y:"+yint);



        RendererService.getRenderer().setMouseOffSetX(RendererService.getRenderer().getMouseOffSetX()+xint);
        RendererService.getRenderer().setMouseOffSetY(RendererService.getRenderer().getMouseOffSetY()+yint);
        RendererService.getRenderer().setMap();
//

    }

    @CrossOrigin
    @PostMapping("/zoom")
    public void setZoom(@RequestParam("zoom") String zoom, @RequestParam("x") String x, @RequestParam("y") String y) {
        int zoomint = Integer.parseInt(zoom);
        int xint = Integer.parseInt(x);
        int yint = Integer.parseInt(y);

        RendererService.getRenderer().setZoom(zoomint,xint,yint);


//        RendererSingleton.getRenderer()
    }

}
