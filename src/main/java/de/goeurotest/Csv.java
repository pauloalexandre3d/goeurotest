package de.goeurotest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Csv {

	private List<City> cities;

	public Csv(List<City> cities) {
		this.cities = cities;
	}

	public void generate() throws CsvException {
		List<String> lines = new ArrayList<String>();
		cities.forEach(city -> lines.add(city.toString()));
		try {
			Files.write(Paths.get("/tmp/locations.csv"), lines, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
			throw new CsvException(e);
		}
	}

}
