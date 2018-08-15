package com.relay42.simplemicro.service;

import org.springframework.stereotype.Service;

import com.relay42.simplemicro.domain.DemoDomain;

@Service
public interface HomeService {
	
	public String getDemoMessage();
	
	public DemoDomain getDemoDomain();

}
