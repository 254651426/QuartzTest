package com.yangjie.service.impl;

import org.springframework.stereotype.Service;

import com.yangjie.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void say() {
		System.out.println("nihao");
	}

}
