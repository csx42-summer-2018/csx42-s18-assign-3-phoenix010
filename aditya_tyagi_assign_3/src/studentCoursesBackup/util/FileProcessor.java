package studentCoursesBackup.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import studentCoursesBackup.driver.StringProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileNotFoundException;


/**Method reads the input file from the user. and returns the string file back to the calling method
 * 
 * @param input.txt
 * @return
 * @throws IOException
 */
	
public class FileProcessor {
	
	BufferedReader bufferedReader; 
	
	public BufferedReader getBufferedReader() {
		return bufferedReader;
	}

	public void setBufferedReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}


	public FileProcessor(String input) {
		InputStream fis = null;
		try {
			fis = new FileInputStream(input);
		} catch (FileNotFoundException e) {
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		this.setBufferedReader(br);
	}

	public String readLine() throws IOException {
		String line;
		try{
		while((line = this.getBufferedReader().readLine()) != null) {
			return line;
		}
		
		}catch(IOException e) {
			System.out.println("File Not Found");
//			e.printStackTrsace();
		}
		return null;
}
	
}