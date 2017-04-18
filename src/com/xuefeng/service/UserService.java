package com.xuefeng.service;

import java.util.HashMap;
import java.util.List;

public interface UserService {
	public String getName() throws Exception;
	public List<Integer> getAge(String name);
}
