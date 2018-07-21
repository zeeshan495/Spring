package com.bridgeit.AnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigFile {

	@Bean
	@Scope("singleton")
	public ConfigMessage configMessage()
	{
		return new ConfigMessage();
	}
	

}
