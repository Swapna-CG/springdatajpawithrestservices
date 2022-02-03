package com.mouritech.springdiexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.mouritech.springdiexample.service.FaceBookSMSService;

@Configuration
@ComponentScan("com.mouritech.springdiexample")
@Import(AppConfiguration2.class)
public class AppConfiguration {
	
	@Bean
	@Scope("prototype")
	public FaceBookSMSService fService() {
		return new FaceBookSMSService();
	}

}
