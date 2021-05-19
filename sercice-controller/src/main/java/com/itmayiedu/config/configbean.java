package com.itmayiedu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class configbean {   // 相当于 spring application-context.xml
	
	//配置负载均衡实现 RestTemplate
	//IRule
	//RoundRobinRule 轮询 实现负载均衡      AbstractLoadBalancerRule抽象负载均衡
	@Bean
	@LoadBalanced    //ribbon  实现
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
