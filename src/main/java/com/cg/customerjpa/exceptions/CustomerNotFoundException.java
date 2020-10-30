package com.cg.customerjpa.exceptions;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException() {
		
	}
	
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
