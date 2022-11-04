package com.tupinamba.api.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class KeyActivatedService {

	@Bean
	public String activatedService(String id, String serial) {
		
		String idactived = id;
		String serialnumber = serial;
		return "ID: "+idactived+" SERIAL: "+serialnumber;
		
	}
	
}
