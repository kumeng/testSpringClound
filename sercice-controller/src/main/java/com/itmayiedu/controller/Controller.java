package com.itmayiedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
@RequestMapping("/demo")
public class Controller {

//	@Autowired
//	private MemberFeign memberFeign;


	@GetMapping("/getMember1")
	public String getMember1(){
		return "sdf";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/getMember2")
	public String getMember2(){
		return restTemplate.getForObject( , responseType, uriVariables);
	}	

	@Autowired
	RestTemplate restTemplate;
//
//	public List<String> getOrderByUserList() {
//		return restTemplate.getForObject("http://service-member/getUserList", List.class);
//	}	
}
