package studentCoursesBackup.util;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Results implements FileDisplayInterface  {

	public void writeToFile1(String s) {
		try {
			PrintStream myconsole = new PrintStream(new File("output1.txt"));
			System.setOut(myconsole);
			myconsole.print(s);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	@Override
	public void writeToFile2(String s) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(s);
		// Create our BufferedWriter.
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output001.txt"))){
			for (String line : ar) {
	            writer.write(line);
	            writer.newLine();
	        }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void writeToFile3(String s) {
        
		
	}
	
	
}