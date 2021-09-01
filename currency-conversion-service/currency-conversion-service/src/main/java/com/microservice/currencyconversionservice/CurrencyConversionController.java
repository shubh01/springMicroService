package com.microservice.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping(value = "currency-conversion-service")
	public String currencyConversionService() {
		return proxy.getCurrencyExchangeRate();
	}
	
	
}
