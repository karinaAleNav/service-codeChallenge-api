package com.optimal.coinCombination.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
@Controller
@Configuration
@EnableWebMvc
public class WebMainController extends DelegatingWebMvcConfiguration {

	
	public static void main(String[] args) {
		SpringApplication.run(WebMainController.class, args);
	} 

   
}
