package com.tupinamba.api.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class GetKeyService {

	@Bean
	public String keyService() {
		
		String keycontent = "NPPR9-FWDCX-D2C8J-H872K-2YT43";
		return keycontent;
		
	}
	
}
