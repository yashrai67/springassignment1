package com.cg.customer.exceptions;

public class InvalidArgumentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidArgumentException() {

	}

	public InvalidArgumentException(String msg) {
		super(msg);
	}
}
