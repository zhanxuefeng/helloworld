package com.xuefeng.mapper;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
	public List<HashMap> getName();
	public List<Integer> getAge(String name);
}
