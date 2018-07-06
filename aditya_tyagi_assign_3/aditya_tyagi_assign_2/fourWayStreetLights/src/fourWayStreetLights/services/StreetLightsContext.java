package fourWayStreetLights.services;


public class StreetLightsContext {
	StreetLightsStateI startStateImplEast;
	StreetLightsStateI startStateImplWest;
	StreetLightsStateI startStateImplNorth;
	StreetLightsStateI startStateImplSouth;
	StreetLightsStateI startStateImplEastWest;
	StreetLightsStateI startStateImplNorthEast;
	StreetLightsStateI startStateImplNorthSouth;
	StreetLightsStateI startStateImplNorthWest;
	StreetLightsStateI startStateImplSouthEast;
	StreetLightsStateI startStateImplSouthWest;
	StreetLightsStateI noCarAtIntersection;
	StreetLightsStateI startStateImplNorthSouthEast;
	StreetLightsStateI startStateImplSouthEastWest;//====
	StreetLightsStateI startStateImplEastWestNorth;
	StreetLightsStateI startStateImplWestNorthSouth;//898989898
	StreetLightsStateI startStateImplNorthSouthEastWest;
	StreetLightsStateI startStateImplAllRed;
	
	StreetLightsStateI streetLightsStateI = noCarAtIntersection;
	int cntCar = 0; //number of cars at intersection point before crossing
	
	public StreetLightsContext(int cntCar, String lightAtEast,String lightAtWest,String lightAtNorth,String lightAtSouth) {
		startStateImplEast = new StartStateImplEast(this);
		startStateImplWest = new StartStateImplWest(this);
		startStateImplNorth = new StartStateImplNorth(this);
		startStateImplSouth = new StartStateImplSouth(this);
		noCarAtIntersection = new NoCarAtIntersection(this);
		startStateImplEastWest = new StartStateImplEastWest(this);
		startStateImplNorthEast = new StartStateImplNorthEast(this);
		startStateImplNorthSouth = new StartStateImplNorthSouth(this);
		startStateImplNorthWest = new StartStateImplNorthWest(this);
		startStateImplSouthEast = new StartStateImplSouthEast(this);
		startStateImplSouthWest = new StartStateImplSouthWest(this);
		startStateImplNorthSouthEast = new StartStateImplNorthSouthEast(this); //check this line 
		startStateImplSouthEastWest = new StartStateImplSouthEastWest(this);
		startStateImplEastWestNorth = new StartStateImplEastWestNorth(this);//78787
		startStateImplWestNorthSouth = new StartStateImplWestNorthSouth(this);
		startStateImplNorthSouthEastWest = new StartStateImplNorthSouthEastWest(this);
		this.cntCar = cntCar;
		startStateImplAllRed = new StartStateImplAllRed(this);
		System.out.println("The value of cntCar is: "+cntCar);
		if(cntCar <= 0) {
			streetLightsStateI = noCarAtIntersection;
		}
		else {
		if(lightAtEast.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplEast;
		}
		if(lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplWest;
		}
		if(lightAtNorth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorth;
		}
		if(lightAtSouth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplSouth;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtSouth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorthSouth;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green")){
			streetLightsStateI =  startStateImplNorthEast;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorthWest;
		}
		if(lightAtSouth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green")){
			streetLightsStateI = startStateImplSouthEast;
		}
		if(lightAtSouth.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")){
			streetLightsStateI = startStateImplSouthWest;
		}
		if(lightAtEast.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplEastWest;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtSouth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorthSouthEast;
		}
		if(lightAtSouth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI =  startStateImplSouthEastWest;
		}
		if(lightAtEast.equalsIgnoreCase("green")&& lightAtWest.equalsIgnoreCase("green") && lightAtNorth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplEastWestNorth;
		}
		if(lightAtWest.equalsIgnoreCase("green") && lightAtNorth.equalsIgnoreCase("green") && lightAtSouth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplWestNorthSouth;
		}
		if(lightAtEast.equalsIgnoreCase("green") && lightAtNorth.equalsIgnoreCase("green") && lightAtSouth.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green") ) {
			streetLightsStateI = startStateImplNorthSouthEastWest;
		}
		if(lightAtEast.equalsIgnoreCase("red") && lightAtNorth.equalsIgnoreCase("red") && lightAtSouth.equalsIgnoreCase("red") && lightAtWest.equalsIgnoreCase("red") ) {
			streetLightsStateI = startStateImplAllRed;
		}
		
		}
		
			
		
	}
	

	public int noOfCarAtIntersection(int number) {
//		System.out.println("Numbers of cars at Intersection before crossing...");
		this.cntCar = number;
		if(this.cntCar != 0 && this.cntCar == 1) {
			this.cntCar = cntCar - 2;
			return this.cntCar;
		}
//		if(cntCar == 1) {
//			cntCar = cntCar - 1;
//			System.out.println("Intersection completed");
//			return cntCar;
//		}
		return this.cntCar;
	}
	public void intersection() {
//		int cntCar = noOfCarAtIntersection();
//		System.out.println("In Context class:"+cntCar );
		System.out.println("Aditya");
		streetLightsStateI.move(cntCar);
	}
	
	void setStreetLightState(StreetLightsStateI streetLightsStateI) {
		this.streetLightsStateI = streetLightsStateI ;
	}

	public StreetLightsStateI getStartStateImplEast() {
		return startStateImplEast;
	}

	public StreetLightsStateI getStartStateImplWest() {
		return startStateImplWest;
	}

	public StreetLightsStateI getStartStateImplNorth() {
		return startStateImplNorth;
	}

	public StreetLightsStateI getStartStateImplSouth() {
		return startStateImplSouth;
	}

	public StreetLightsStateI getStartStateImplEastWest() {
		return startStateImplEastWest;
	}

	public StreetLightsStateI getStartStateImplNorthEast() {
		return startStateImplNorthEast;
	}

	public StreetLightsStateI getStartStateImplNorthSouth() {
		return startStateImplNorthSouth;
	}

	public StreetLightsStateI getStartStateImplNorthWest() {
		return startStateImplNorthWest;
	}

	public StreetLightsStateI getStartStateImplSouthEast() {
		return startStateImplSouthEast;
	}

	public StreetLightsStateI getStartStateImplSouthWest() {
		return startStateImplSouthWest;
	}

	public StreetLightsStateI getNoCarAtIntersection() {
		return noCarAtIntersection;
	}

	public StreetLightsStateI getStartStateImplNorthSouthEast() {
		return startStateImplNorthSouthEast;
	}

	public StreetLightsStateI getStartStateImplSouthEastWest() {
		return startStateImplSouthEastWest;
	}

	public StreetLightsStateI getStartStateImplEastWestNorth() {
		return startStateImplEastWestNorth;
	}

	public StreetLightsStateI getStartStateImplWestNorthSouth() {
		return startStateImplWestNorthSouth;
	}

	public StreetLightsStateI getStartStateImplNorthSouthEastWest() {
		return startStateImplNorthSouthEastWest;
	}

	public StreetLightsStateI getStreetLightsStateI() {
		return streetLightsStateI;
	}

	public int getCntCar() {
		return cntCar;
	}
		
	}
  