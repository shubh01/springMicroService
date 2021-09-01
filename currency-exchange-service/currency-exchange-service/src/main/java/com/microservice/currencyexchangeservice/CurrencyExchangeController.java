package com.microservice.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@GetMapping(value = "currency-exchange-service")
	public String getCurrencyExchange() {
		return "current USD rate is 754";
	}
	
}
