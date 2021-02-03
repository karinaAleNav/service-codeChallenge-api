package com.optimal.coinCombination.context;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CoinCombinationController {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CoinCombinationController.class, args);
	}
	
	@GetMapping("/coinService")
	@CrossOrigin
	public LinkedHashMap<String,Integer> coinGetService(@RequestParam BigDecimal amount) {
		LinkedHashMap<String,Integer> resultCom = null;
		try {

			CoinCombinationProcess coinComProcess = new CoinCombinationProcess();
			resultCom =  coinComProcess.getCombination(amount);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		return resultCom;
	}
	
	
	

			
}
