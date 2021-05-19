package com.itmayiedu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyRule {   // 相当于 spring application-context.xml
	
	//配置负载均衡实现 RestTemplate
	//IRule
	//RoundRobinRule 轮询 实现负载均衡      AbstractLoadBalancerRule抽象负载均衡

	
	//实例化随机负载均衡，覆盖默认的轮询负载均衡实现，也可以实例化自定义的类覆盖默认的负载均衡实现
	@Bean
	public IRule myrule(){
		return new RandomRule();
	}
}
