package com.walter.boottrafficsim.services;

import com.walter.boottrafficsim.simulator.Simulation;

public class SimulationService {
    private static Simulation sim;

    public static Simulation getSim() {
        return sim;
    }

    public static void setSim(Simulation sim) {
        SimulationService.sim = sim;
    }
}
