package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;

public class StartStateImplEast implements StreetLightsStateI{
	
	StreetLightsContext streetLightsContext;
	public StartStateImplEast(StreetLightsContext streetLightsContext ) {
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
		System.out.println("Traffic Light at the East is GREEN");
		Results results = new Results();
		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the EAST.");
			cntCar = cntCar-2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("After Crossing, number of Cars left to cross: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			
			results.writeToFile("Traffic Light at the East is green. Two cars are allowed to cross. Number of cars left to cross is: "+cntCar );
			
//			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplWest());
//			streetLightsContext.noOfCarAtIntersection(cntCar);
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the East");
			cntCar = cntCar-1;
			System.out.println("After Crossing, number of cars left after intersection: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			results.writeToFile("Traffic Light at the East is green. One car is allowed to cross. Number of cars left to cross is: "+cntCar );
			
		}

	}
}
