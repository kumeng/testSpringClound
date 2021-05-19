package com.itmayiedu.servie;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-order")
public interface OrderFeign {
	@RequestMapping("/getorder2")
	public String getorder2();
}
