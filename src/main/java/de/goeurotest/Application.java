package de.goeurotest;

public class Application {

	public static void main(String[] args) throws CitiesExceptions, CsvException {
		Cities cities = new Cities(args[0]);
		Csv csvFile = new Csv(cities.getInformations());
		csvFile.generate();
	}

}
