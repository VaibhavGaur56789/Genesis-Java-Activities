package exceptionex;

public class teamCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public teamCustomException() {
		super();
		System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
	}
	

}
