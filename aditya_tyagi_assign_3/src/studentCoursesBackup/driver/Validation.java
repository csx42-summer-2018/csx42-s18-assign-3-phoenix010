package studentCoursesBackup.driver;

public class Validation {
	/**
	 * This method validates the command line arguments.
	 * It checks that whether the user have given more than zero arguments,
	 * but not more than three arguments
	 *  
	 * @param args args is the string array which comprises our input 
	 */

	public void cmdValidation(String [] args) {
		if(args.length == 0) {
			System.err.println("Please insert some arguments at command line");
			System.exit(0);
		}
		if(args.length > 6) {
			System.err.println("Command Line arguments cannot be more than three");
			System.exit(0);
		}
		
	}
}

