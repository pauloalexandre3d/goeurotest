package de.goeurotest;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.junit.Test;

public class IntegrationTest {

	private final String CITY_NAME = "Berlin";
	
	@Test
	public void test_should_get_some_content_from_api() throws CitiesExceptions {
		Cities api = new Cities(CITY_NAME);
		InputStream geoInformations = api.getContentFromEndpoint();
		assertNotNull(geoInformations);
	}
	
	@Test
	public void test_should_get_city_informations_from_api() throws CitiesExceptions {
		Cities api = new Cities(CITY_NAME);
		List<City> geoInformations = api.getInformations();
		assertFalse(geoInformations.isEmpty());
	}
	
}
