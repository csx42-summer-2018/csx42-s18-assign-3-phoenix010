package fourWayStreetLights.util;

import java.io.IOException;

public class StringProcessor {
	
public String processing(String input)throws IOException {
	
	String str ="";
	
	try{
		FileProcessor fileprocessor = new FileProcessor();
	
	String inp = fileprocessor.readLine(input);
	
	String[] file = inp.split(",");
	
	String noOfCars = file[1];
	String east = file[3];
	String west = file[4];
	String north = file[5];
	String south = file[6];
	
	//splitting
//	System.out.println(noOfCars);
	String[] dirEast = east.split("-");
//	System.out.println(dirEast[1]);
	
	String[] dirWest = west.split("-");
//	System.out.println(dirWest[1]);
	
	String[] dirNorth = north.split("-");
//	System.out.println(dirNorth[1]);
	
	String[] dirSouth = south.split("-");
//	System.out.println(dirSouth[1]);
	
	str = noOfCars +","+dirEast[1]+","+dirWest[1]+","+ dirNorth[1]+","+dirSouth[1];
//	System.out.println(str);
	
//	return str;

	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
	return str;
}
}
