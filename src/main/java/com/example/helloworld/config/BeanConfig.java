package com.example.helloworld.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.helloworld.service.CollegeServiceImpl2;
import com.example.helloworld.service.ICollegeService;
import com.example.helloworld.service.UnivercityService;
import com.example.helloworld.service.UtilityService;

@Configuration
public class BeanConfig {

	@Bean
	public UtilityService utilityService() {
		return new UtilityService(1000, 2000);
	}

	@Bean
	public ICollegeService collegeServiceImpl2() {
		return new CollegeServiceImpl2();
	}

	@Bean
	public ICollegeService univercityService() {
		return new UnivercityService();
	}

}
