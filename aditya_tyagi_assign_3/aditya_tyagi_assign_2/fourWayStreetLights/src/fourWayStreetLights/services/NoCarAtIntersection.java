package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;
/**
 * 
 * @author aditya
 *
 */

//import fourWayStreetLights.util.MyLogger;

public class NoCarAtIntersection implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	
	public NoCarAtIntersection(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	/**
	 * method takes one int type variable and 
	 * processes it accordingly. This method prints a simple statement which 
	 * states that either all cars are crrosed or there is no car left to cross
	 * 
	 * @param intCar intCar is the int type variable which tells us number of cars left after intersection
	 */
	public void move(int cntCar) {
		
//		MyLogger logger = new MyLogger();
		Results results = new Results();
		System.out.println("Either there is no cars to cross or all cars are crossed");
		results.writeToFile("Either there is no cars to cross or all cars are crossed");
}
		
}
