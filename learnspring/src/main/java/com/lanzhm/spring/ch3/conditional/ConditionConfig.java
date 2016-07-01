package com.lanzhm.spring.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsCondition.class)
	WindowsListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	LinuxListService linuxListService(){
		return new LinuxListService();
	}
}
