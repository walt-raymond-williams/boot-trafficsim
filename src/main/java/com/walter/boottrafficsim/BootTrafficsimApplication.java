package com.walter.boottrafficsim;

import com.walter.boottrafficsim.simulator.Simulation;
import com.walter.boottrafficsim.simulator.TrafficSimProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class BootTrafficsimApplication {

	public static void main(String[] args) {

//		ExecutorService executorService = Executors.newCachedThreadPool();
//		Simulation sim = new Simulation();
//
//		executorService.execute(sim);
		TrafficSimProject sim = new TrafficSimProject();
		sim.start();

		SpringApplication.run(BootTrafficsimApplication.class, args);


//
//		executorService.shutdown();


	}

}
