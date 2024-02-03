package com.example.gatewaytestapi.gatewaytestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
@EnableDiscoveryClient
public class GatewaytestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaytestapiApplication.class, args);
	}

	@GetMapping(value = "/getMessage")
	public String getMessage(){
		return "Hello api";
	}
}
