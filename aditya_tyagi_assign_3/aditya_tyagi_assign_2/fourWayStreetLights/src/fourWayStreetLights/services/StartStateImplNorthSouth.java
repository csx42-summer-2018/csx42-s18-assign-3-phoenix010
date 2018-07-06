package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;

public class StartStateImplNorthSouth implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	public StartStateImplNorthSouth(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		Results results = new Results();
		if(cntCar == 1) {
			System.out.println("Only one car for intersection.It will be croosed from North.So, Traffic Light at the South is changed to Red");
//			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplNorth());
			streetLightsContext.startStateImplNorth.move(cntCar);
			System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
			results.writeToFile("Only one car for intersection.So, Traffic Light at the South is changed to from green to  Red and car is crossed from the North. After crossing, traffic light at the north changes from green to red. Number of cars left after intersection: "+(cntCar-1));
			
		}
		
		else if(cntCar ==2) {
			System.out.println("Both cars are crossed from the North. No need to pass them from the South");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic Light at the North Changed to RED");
			System.out.println("Traffic Light at the South Changed to RED");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
			results.writeToFile("Both cars are crossed from the North. No need to pass them from the South. Traffic Light at the South is changed to RED.After crossing, Traffic Light at the North is changed to RED. Number of cars left after intersection: "+cntCar);
			
		}
		else {
			System.out.println("Two cars are crossed from the North");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic light at the North Changed to RED");
			
			
			if(cntCar == 1) {
				System.out.println("Only 1 car can be crossed from the South");
				cntCar = cntCar - 1;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The South is Changed to Red");
				streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
//				streetLightsContext.noCarAtIntersection.move(cntCar);
				System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
				results.writeToFile("Two cars are croosed from the north and the traffic light at the north is turned from green to red. Only one car is crossed from the South and its traffic light is turned from green to red. Number of cars left after intersection : "+cntCar);
			
			}
			else {
				System.out.println("Two cars are crossed from the South");
				cntCar = cntCar -2;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The South is Changed to Red");
				System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
				results.writeToFile("Two cars are croosed from the north and the traffic light at the north is turned from green to red. Two cars are crossed from the South and its traffic light is turned from green to red. Number of cars left after intersection: "+cntCar);
			
				
			}
		}
		
	}
}
