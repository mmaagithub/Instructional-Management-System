package com.service;

import java.util.List;

import com.role.Page;

public interface FyService {
	//计算出Page属性的值
		Page page();
		//按照分页查询全部
		List selectAll(int offsetone,int slide);
}
