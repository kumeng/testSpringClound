package com.itmayiedu.impl;

import org.springframework.stereotype.Component;

import com.itmayiedu.feign.MemberFeign;

@Component
public class memberServiceHystric implements MemberFeign {

	@Override
	public String getMember1() {
		// TODO Auto-generated method stub
		return "服务器挂了";
	}

}
