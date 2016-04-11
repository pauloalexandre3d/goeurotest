package de.goeurotest;

import java.io.IOException;

public class CsvException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7969672872482715805L;

	public CsvException(IOException e) {
		super(e);
	}

}
