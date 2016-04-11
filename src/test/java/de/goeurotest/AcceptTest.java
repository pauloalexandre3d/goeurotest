package de.goeurotest;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.Test;

public class AcceptTest {

	private final String CITY_NAME = "Berlin";
	private Path path = Paths.get("/tmp/locations.csv");

	@Test
	public void acceptTest_should_verify_content_csv_file() throws IOException, CitiesExceptions, CsvException {
		String[] args = { CITY_NAME };
		Application.main(args);
		assertCorrectResult();
	}

	private void assertCorrectResult() throws IOException {
		List<String> lines = Files.readAllLines(path);
		assertFalse(lines.isEmpty());
	}
	
	@After
	public void deleteFileLocation() throws IOException {
		Files.delete(path);
	}

}
