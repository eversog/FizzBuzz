package com.eversog.fizzbuzz.service;

public class InvalidEntryException extends Exception {

	private static final long serialVersionUID = -8774796902155672936L;

	public InvalidEntryException(String message) {
		super(message);
	}
}
