package com.in28Minutes.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class CurrancyServiceController {
	
@Autowired
private CurrancyServiceConfiguration currancySevviceConfiguration;
	
@RequestMapping("/currancy-configuration")
public CurrancyServiceConfiguration getConfiguration()
{
	return currancySevviceConfiguration;
	  
}
}
