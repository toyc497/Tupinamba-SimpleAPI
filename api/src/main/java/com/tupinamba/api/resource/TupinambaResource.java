package com.tupinamba.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tupinamba.api.service.GetKeyService;
import com.tupinamba.api.service.KeyActivatedService;
import com.tupinamba.api.service.KeyBloquedService;

@RestController
@RequestMapping(value="/tupinamba")
public class TupinambaResource {
	
	@Autowired
	private GetKeyService getKeyService;
	
	@Autowired
	private KeyBloquedService keyBloquedService;
	
	@Autowired
	private KeyActivatedService keyActivatedService;
	
	@GetMapping("/getkey")
	public String getKey() {
		
		return getKeyService.keyService();
	}
	
	@PostMapping("/keybloqued/{id}")
	public String updateKeyStateBloqued(@PathVariable("id") String id) {
		
		return keyBloquedService.bloquedService(id);
		
	}
	

	@PostMapping("/keyactived/{id}/{serial}")
	public String updateStateActived(@PathVariable("id") String id, @PathVariable("serial") String serial) {
		
		return keyActivatedService.activatedService(id, serial);
		
	}
	
}
