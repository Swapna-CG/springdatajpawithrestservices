package com.mouritech.springdiexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

//import com.mouritech.springdiexample.service.FaceBookSMSService;
import com.mouritech.springdiexample.service.WhatsAppSMSService;

public class AppConfiguration2 {
	@Bean
	@Scope("prototype")
	public WhatsAppSMSService wService() {
		return new WhatsAppSMSService();
	}
}
