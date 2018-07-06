package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;
/**
 * 
 * @author aditya
 *
 */
public class StartStateImplAllRed implements StreetLightsStateI{
	StreetLightsContext streetLightsContext;
	public StartStateImplAllRed(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	/**
	 * method takes one int type variable and 
	 * processes it accordingly. The method prints simple statement 
	 * stating that all traffic lights are red and now no car can cross
	 * 
	 * @param intCar intCar is the int type variable which tells us number of cars left after intersection
	 */
	 
	public void move(int cntCar) {
		System.out.println("All lights are RED. So no car can cross");
		Results results = new Results();
		results.writeToFile("All lights are RED. So no car can cross");

	}

}
