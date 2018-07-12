package studentCoursesBackup.util;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class Results implements FileDisplayInterface  {

	public void writeToFile1(String s1) {
		try {
			PrintStream myconsole = new PrintStream(new File("output1.txt"));
			System.setOut(myconsole);
			myconsole.print(s1);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	@Override
	public void writeToFile2(String s2) {
		try {
			PrintStream myconsole2 = new PrintStream(new File("output2.txt"));
			System.setOut(myconsole2);
			myconsole2.print(s2);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void writeToFile3(String s3) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output3.txt"))){
		    
				writer.write(s3);
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}