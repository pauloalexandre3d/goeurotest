package de.goeurotest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Cities {

	private StringBuilder endpoint = new StringBuilder("http://api.goeuro.com/api/v2/position/suggest/en/");
	private StringBuilder url;

	public Cities(String cityName) {
		this.url = endpoint.append(cityName);
	}

	protected InputStream getContentFromEndpoint() throws CitiesExceptions {
		URL url;
		InputStream is;
		try {
			url = new URL(this.url.toString());
			is = url.openStream();
		} catch (IOException e) {
			e.printStackTrace();
			throw new CitiesExceptions(e);
		}
		return is;
	}

	protected List<City> getInformations() throws CitiesExceptions {
		ObjectMapper mapper = new ObjectMapper();
		List<City> list = null;
		try {
			list = mapper.readValue(getContentFromEndpoint(), new TypeReference<List<City>>(){});
		} catch (IOException e) {
			e.printStackTrace();
			throw new CitiesExceptions(e);
		}
		return list;
	}
}
