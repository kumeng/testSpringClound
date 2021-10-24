package com.itmayiedu.controller;

/**
 * 使用restTemplate请求一个微服务地址，  
 * 使用ribbon作用在 restTemplate上，在请求端读取  实现负载均衡
 */
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/demoRibbon")
public class ControllerForRibbon {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/getMember1")
	public String getMember1(){
		logger.info("ribbon getMember1  ");
		return restTemplate.getForObject("http://service-member/getMemberInfo", String.class);
	}
	@Autowired
	RestTemplate restTemplate;
	
} 
