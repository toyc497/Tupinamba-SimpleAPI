package com.tupinamba.api.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class KeyBloquedService {

	@Bean
	public String bloquedService(String id) {
		
		String idbloq = id;
		return idbloq;
		
	}
	
}
