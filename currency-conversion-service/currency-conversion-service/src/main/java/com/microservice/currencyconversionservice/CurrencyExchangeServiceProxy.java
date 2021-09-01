package com.microservice.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping(value="/currency-exchange-service")
	public String getCurrencyExchangeRate();
	
}
