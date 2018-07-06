package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;
public class StartStateImplWest implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplWest(StreetLightsContext streetLightsContext ) {
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

		System.out.println("Traffic Light at the WEST is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the WEST.");
			cntCar = cntCar-2;
			System.out.println("After Crossing , number of cars left to cross: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
//			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplNorth());
			results.writeToFile("Traffic Light at the West is green. Two cars are allowed to cross. Number of cars left to cross is: "+cntCar );
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the West");
			cntCar = cntCar-1;
			System.out.println("After Crossing it should be 0: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			results.writeToFile("Traffic Light at the West is green. Only one cars are allowed to cross. Number of cars left to cross is: "+cntCar );
			
		
		}

		}
}
