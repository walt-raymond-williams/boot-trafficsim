package com.walter.boottrafficsim.util;

import com.walter.boottrafficsim.simulator.Renderer;

public class RendererSingleton {
    public static Renderer renderer;

    public static Renderer getRenderer() {
        return renderer;
    }

    public static void setRenderer(Renderer renderer) {
        RendererSingleton.renderer = renderer;
    }
}
