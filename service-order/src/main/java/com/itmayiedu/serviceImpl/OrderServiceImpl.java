package com.itmayiedu.serviceImpl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.OrderService;


@Service
@RestController
@RequestMapping("/")
public class OrderServiceImpl implements OrderService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${server.port}")
	private String posrt;
	
	@Override
	@GetMapping(value={"getOrder"})	
	public String getOrder() {
		// TODO Auto-generated method stub
		logger.info("orderService  getOrder  "+posrt);
		return posrt+"订单服务";
	}

}
