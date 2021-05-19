package com.itmayiedu.serviceImpl;

import org.springframework.stereotype.Service;

import com.itmayiedu.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public String getorder2() {
		// TODO Auto-generated method stub
		return "测试订单服务2";
	}
		
}
