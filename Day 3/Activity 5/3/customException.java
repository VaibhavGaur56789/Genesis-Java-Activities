package exceptionex;

class customException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public customException() {
		super();
		System.out.println("CustomException: InvalidAgeRangeException");
	}

}
