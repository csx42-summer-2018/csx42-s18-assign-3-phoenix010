package fourWayStreetLights.driver;

import java.io.IOException;
import fourWayStreetLights.services.StreetLightsContext;
import fourWayStreetLights.util.StringProcessor;

public class Driver {
	public static void main(String[] args)throws IOException,NullPointerException {
		
		try {
		String file = args[0];
		Validation vd = new Validation();
		vd.cmdValidation(args);
		StringProcessor str = new StringProcessor();
		String input = str.processing(file);
		
//		System.out.println(input);
		
		String [] splitArray = input.split(",");
		
		String noOfCars = splitArray[0];
		int cntCar = Integer.parseInt(noOfCars);
		String lightAtEast = splitArray[1];
		String lightAtWest = splitArray[2];
		String lightAtNorth = splitArray[3];
		String lightAtSouth = splitArray[4];
		
		StreetLightsContext streetlightcontext = new StreetLightsContext(cntCar, lightAtEast, lightAtWest, lightAtNorth, lightAtSouth);
		streetlightcontext.intersection();
		}catch(IOException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("You need to insert some input in your command line");
			System.out.println("Exiting");
			ex.printStackTrace();
			
		}catch(NullPointerException e) {
			System.out.println("Your input values are wrong.Example: you are giving wromg input to traffic lights");
			e.printStackTrace();
		}
	}
}

