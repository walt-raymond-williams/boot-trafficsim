package com.walter.boottrafficsim.services;

import com.walter.boottrafficsim.simulator.Renderer;

public class RendererService {
    public static Renderer renderer;

    public static Renderer getRenderer() {
        return renderer;
    }

    public static void setRenderer(Renderer renderer) {
        RendererService.renderer = renderer;
    }
}
