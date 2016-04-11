package de.goeurotest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void test_should_assert_values_comma_separated() {
		City city = new City("377078","Potsdam","location",new CityGeoPosition("52.39886", "13.06566"));
		assertTrue("377078,Potsdam,location,52.39886,13.06566".equals(city.toString()));
	}

}
