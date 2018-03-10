package com.dao;

import java.util.List;

public interface Dao {
	//查询全部
	List selectAll();
	//删除
	int delete(int id);
	//修改
	int update(Object...obj);
	//增加
	int add(Object obj);
}
