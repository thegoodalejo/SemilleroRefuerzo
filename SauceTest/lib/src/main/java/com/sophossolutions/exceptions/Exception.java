package com.sophossolutions.exceptions;

public class Exception extends AssertionError{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Exception(String msgError, Throwable trbCause) {
		super(msgError, trbCause);
	}

}
