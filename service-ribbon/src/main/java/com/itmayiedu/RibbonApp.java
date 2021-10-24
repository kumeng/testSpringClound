package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.itmayiedu.config.MyRule;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApp {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApp.class, args);
	}



}
