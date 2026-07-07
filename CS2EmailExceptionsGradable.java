

/**
 * Interface to require specific methods for grading Exceptions Lab
 * in CS-145.
 * @version 1.0
 * @author masont - Professor Mason
 */
public interface CS2EmailExceptionsGradable {
	public static final int TOTALPOINTS = 100;
	public static final int NOCREDIT = 0;
	
	/**
	 * constainsAt - confirms the existence of the @ in the email
	 * @return - index of @ symbol in email address
	 * @throws EmailFormatException - thrown for missing @ symbol
	 * with message "Missing @ symbol in email"
	 */
	public int containsAt() throws EmailFormatException;
	
	/**
	 * UW-Stout has two domains. Students use my.uwstout.edu and others 
	 * use uwstout.edu. This method 
	 * @return - returns true for a validated domain
	 * @throws EmailFormatException - includes message to specify exception:
	 * 		message - "Incorrect domain, expected my.uwstout.edu" for a student
	 * 					or "Incorrect domain, expected uwstout.edu" for others
	 */
	public boolean validateStoutDomain(int indexOfAt) throws EmailFormatException;
	
	/**
	 * Your UW-Stout username is the part of your email address 
	 * before the "@" symbol, which is used to log into most campus 
	 * resources like Access Stout and Canvas. 
	 * @return - true if valid
	 * @throws EmailFormatException - includes message to specify exception:
	 * 		message - "Does not match name" if it is not last name + first initial
	 * 		message - "Invalid digits" if student and missing four digits at end of name
	 * 		
	 */
	public boolean validateUsername() throws EmailFormatException;
	
	/**
	 * Method to show that the creator of an interface can require
	 * you to write a method to implement the interface.
	 * @return - returns value of 42.
	 */
	public int justBecause();
}
