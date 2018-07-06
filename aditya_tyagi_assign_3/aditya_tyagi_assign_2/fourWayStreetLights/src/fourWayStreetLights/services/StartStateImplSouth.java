package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;

public class StartStateImplSouth implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplSouth(StreetLightsContext streetLightsContext) {
		
		this.streetLightsContext = streetLightsContext ;
	}

	/**
	 * method takes one int type variable and 
	 * processes it according to the intCar variable.
	 * If intCar is greater than 1, then two cars are crossed from the east. If intCar is equal to 1, 
	 * then, only one car is crossed.
	 * 
	 * @param intCar intCar is the int type variable which tells us number of cars left after intersection
	 */

	public void move(int cntCar) {

		Results results = new Results();
		System.out.println("Traffic Light at the South is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the SOUTH.");
			cntCar = cntCar-2;
			System.out.println("After Crossing, number of cars left to cross: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
//			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			results.writeToFile("Traffic Light at the South is green. Two cars are allowed to cross. Number of cars left to cross is: "+cntCar );
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the South");
			cntCar = cntCar-1;
			System.out.println("After Crossing, number of cars after crossing: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			results.writeToFile("Traffic Light at the South is green. Only one car is  allowed to cross. Number of cars left to cross is: "+cntCar );
			
		
		}

		
	}
}
