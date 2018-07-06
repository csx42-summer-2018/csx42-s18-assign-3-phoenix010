package fourWayStreetLights.services;

import fourWayStreetLights.util.Results;

public class StartStateImplEastWest implements StreetLightsStateI {
	StreetLightsContext streetLightsContext;
	public StartStateImplEastWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		Results results = new Results();
		if(cntCar == 1) {
			System.out.println("Only one car for intersection.It will be crossed from the East.So, Traffic Light at the West is changed to Red");
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplEast());
			streetLightsContext.startStateImplEast.move(cntCar);
			System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
			results.writeToFile("Only one car for intersection.So, Traffic Light at the West is changed from green to Red and car is crossed from the East. After intersection, traffic light at the East is going to change from green to red.Number of cars left after intersection: "+(cntCar-1));
		}
		
		else if(cntCar ==2) {
			System.out.println("Both cars are crossed from the East. No need to pass them from the West");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic Light at the East Changed to RED");
			System.out.println("Traffic Light at the West Changed to RED");
			System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
			results.writeToFile("Both cars are crossed from the East. No need to pass them from the West.Traffic Light at the East is changed to RED.After crossing,Traffic Light at the West is changed to RED. Number of cars left after intersection: "+cntCar);
		}
		else {
			System.out.println("Two cars are crossed from the East");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic light at the East Changed to RED");
			
			
			if(cntCar == 1) {
				System.out.println("Only 1 car can be crossed from the West");
				cntCar = cntCar - 1;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The West is Changed to Red");
				streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
//				streetLightsContext.noCarAtIntersection.move(cntCar);
				System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
				results.writeToFile("Two cars are croosed from the east and the traffic light at the east is turned from green to red. Only one car is crossed from the west and its traffic light is turned from green to red. Number of cars left after intersection: "+cntCar);
			}
			else {
				System.out.println("Two cars are crossed from the West");
				cntCar = cntCar -2;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The West is Changed to Red");
				System.out.println("number of Cars left after Intersection: "+streetLightsContext.noOfCarAtIntersection(cntCar));
				results.writeToFile("Two cars are croosed from the east and the traffic light at the east is turned from green to red. Two cars are crossed from the west and its traffic light is turned from green to red. Number of cars left after intersection: "+cntCar);
				
			}
		}
		
	}
			
}

