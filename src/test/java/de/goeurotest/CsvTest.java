package de.goeurotest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class CsvTest {

	private Path path = Paths.get("/tmp/locations.csv");

	@Test
	public void test_should_assert_file_csv_created() throws CsvException, IOException {
		List<City> cities = new ArrayList<>();
		cities.add(new City("1", "name", "type", new CityGeoPosition("latitude", "longitude")));
		cities.add(new City("2", "name", "type", new CityGeoPosition("latitude", "longitude")));
		cities.add(new City("3", "name", "type", new CityGeoPosition("latitude", "longitude")));
		Csv csv = new Csv(cities);
		csv.generate();
		
		List<String> lines = Files.readAllLines(path);
		assertFalse(lines.isEmpty());
		assertTrue(lines.size() == 3);
	}
	
	@After
	public void deleteFileLocation() throws IOException {
		Files.delete(path);
	}

}
