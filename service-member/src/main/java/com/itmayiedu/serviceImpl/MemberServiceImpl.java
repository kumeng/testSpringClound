package com.itmayiedu.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itmayiedu.service.MemberService;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Resource
	com.itmayiedu.servie.OrderFeign OrderFeign;

	@Override
	public String getMember1() {
		// TODO Auto-generated method stub
		return "测试member服务1"+OrderFeign.getorder2();
	}

}
