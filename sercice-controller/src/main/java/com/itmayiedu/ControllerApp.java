package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.itmayiedu.config.MyRule;

@SpringBootApplication
//@ComponentScan(basePackages={"com.itmayiedu.servie"})
//@EnableEurekaClient
//@RibbonClient(name="service-name",configuration=MyRule.class)//启动识加载自定义的ribbon实现类，实现负载均衡
public class ControllerApp {

	public static void main(String[] args) {
		SpringApplication.run(ControllerApp.class, args);
	}



}
