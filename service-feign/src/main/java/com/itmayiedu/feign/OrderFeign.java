package com.itmayiedu.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmayiedu.impl.memberServiceHystric;

@FeignClient(value="service-order")
public interface OrderFeign {
	@RequestMapping(value="/getOrder",method=RequestMethod.GET)
	public String getOrder();	
}
