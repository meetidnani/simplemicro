package com.relay42.simplemicro.service;

import org.springframework.stereotype.Service;

import com.relay42.simplemicro.domain.DemoDomain;

@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public String getDemoMessage() {
		return "Hello Meet";
	}

	@Override
	public DemoDomain getDemoDomain() {
		DemoDomain demo = new DemoDomain("Meet", "Idnani", "1054 WE", "177-2");
		return demo;
	}

}
