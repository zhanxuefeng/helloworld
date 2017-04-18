package com.xuefeng.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuefeng.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService UserService;
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/name")
	public String getName() throws Exception {
		return this.UserService.getName();
	}
}
