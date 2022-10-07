package com.in28Minutes.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currancy-service")
//@EnableConfigurationProperties
@Component
public class CurrancyServiceConfiguration {

	private String url; 
	private String key;
	private String pass;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
//	public CurrancyServiceConfiguration(String url, String key, String pass) {
//		super();
//		this.url = url;
//		this.key = key;
//		this.pass = pass;
//	}
	
	
}
