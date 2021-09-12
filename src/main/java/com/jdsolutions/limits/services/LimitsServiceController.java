package com.jdsolutions.limits.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdsolutions.limits.services.bean.LimitConfiguration;
import com.jdsolutions.limits.services.config.PropertiesReaderConfiguraton;

@RestController
public class LimitsServiceController {

	@Autowired
	private PropertiesReaderConfiguraton propertiesReaderConfiguraton;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimits() {
		return new LimitConfiguration(propertiesReaderConfiguraton.getMiximum(),propertiesReaderConfiguraton.getMinimum());
	}

}
