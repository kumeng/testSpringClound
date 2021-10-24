package com.itmayiedu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itmayiedu.feign.MemberFeign;
import com.itmayiedu.feign.OrderFeign;




@RestController
@RequestMapping("/demoFeign")
public class ControllerForFeign {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MemberFeign memberFeign;
	@Autowired
	OrderFeign orderFeign;

	@GetMapping("/getMember1")
	public String getMember1(){
		logger.info("feign getMember1  ");
		return memberFeign.getMember1()+orderFeign.getOrder();
	}
}
