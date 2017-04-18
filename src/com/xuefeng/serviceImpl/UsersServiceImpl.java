package com.xuefeng.serviceImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuefeng.mapper.UserMapper;
import com.xuefeng.service.UserService;

@Service("userService")
public class UsersServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public String getName() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		String string = "";
			string = objectMapper.writeValueAsString(this.userMapper.getName());
		
		return string;
	}

	@Override
	public List<Integer> getAge(String name) {
		return this.userMapper.getAge(name);
	}
	
}
