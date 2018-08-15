package com.relay42.simplemicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relay42.simplemicro.domain.DemoDomain;
import com.relay42.simplemicro.service.HomeService;

@RestController
public class HomeContoller {
	
	@Autowired
	private HomeService homeService;

	public HomeContoller(HomeService homeService) {
		this.homeService = homeService;
	}
	
	@GetMapping(value = "/api/v1/getDemoMessage")
	public String getDemoMessage() {
		return homeService.getDemoMessage();
	}
	
	@GetMapping(value = "api/v1/getDemoDomain")
	public DemoDomain getDemoDomain() {
		return homeService.getDemoDomain();
	}

}
