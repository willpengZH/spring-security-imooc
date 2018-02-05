package com.imooc.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "imooc.security")
public class SecurityProperties {
	
	private BrowserProperties browser = new BrowserProperties();
}