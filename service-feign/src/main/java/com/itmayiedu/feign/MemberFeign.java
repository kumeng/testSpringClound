package com.itmayiedu.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmayiedu.impl.memberServiceHystric;

//@FeignClient("service-member")
@FeignClient(value="service-member",fallback=memberServiceHystric.class)
public interface MemberFeign {
	@RequestMapping(value="/getMemberInfo",method=RequestMethod.GET)
	public String getMember1();	
}
