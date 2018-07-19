package com.bridgeit.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigFile {

	@Bean
	@Scope("prototype")
	public ConfigMessage configMessage()
	{
		return new ConfigMessage();
	}

}
