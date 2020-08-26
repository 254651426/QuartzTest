package com.quartz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.yangjie.service.UserService;

public class QuartzTest {

	@Autowired
	private UserService userService;

	public void show() {
		System.out.println(new Date().toLocaleString() + "===========");
		userService.say();
	}
}
