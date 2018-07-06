package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;

public class StartStateImplNorthSouthEastWest implements StreetLightsStateI{

StreetLightsContext streetLightsContext;
	
	public StartStateImplNorthSouthEastWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	public void move(int cntCar) {
		Results results = new Results();
		System.out.println("You cannot have 4 green lights at an intersection in Real Life Scenario. This State is Impossible");
		results.writeToFile("You cannot have 4 green lights at an intersection in Real Life Scenario. This State is Impossible");
	}

}
