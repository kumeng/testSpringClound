package com.itmayiedu.serviceImpl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.MemberService;


@Service
@RestController
@RequestMapping("/")
public class MemberServiceImpl implements MemberService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${server.port}")
	private String posrt;
	
	@Override
	@GetMapping(value={"getMemberInfo","getMember1"})	
	public String getMember1() {
		// TODO Auto-generated method stub
		logger.info("service-member getMember1  "+posrt);
		return posrt+"测试member服务1";
	}

}
