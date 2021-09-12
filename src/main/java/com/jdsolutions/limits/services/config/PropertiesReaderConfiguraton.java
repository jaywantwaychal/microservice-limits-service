package com.jdsolutions.limits.services.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class PropertiesReaderConfiguraton {
	
	private int minimum;
	private int miximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMiximum() {
		return miximum;
	}
	public void setMiximum(int miximum) {
		this.miximum = miximum;
	}
	
	

}
