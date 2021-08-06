package com.sophossolutions.exceptions;

public class Error extends AssertionError
{
	private static final long serialVersionUID = 1L;

	public Error(String strMsgError, Throwable trbCause)
	{
		super(strMsgError, trbCause);
	}
}