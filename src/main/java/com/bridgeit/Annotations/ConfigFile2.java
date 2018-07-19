package com.bridgeit.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
@Configuration
@Import(ConfigFile.class)
public class ConfigFile2 {
	
	@Bean
	@Scope("prototype")
	public ConfigMessage2 configMessage2()
	{
		return new ConfigMessage2();
	}
	

}
