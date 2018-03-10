package com.service;

import java.util.List;

import com.role.Student;

public interface Service {
	//查看全部学生的信息
	List SelectAll();
	//删除单个学生
	int Delete(int id);
	//修改单个学生的多个信息
	int Update(Object...obj);
	//增加单个学生
	int Add(Object obj);
	//在user里增加相应的信息
	int StudentAddUser(Object obj);
}
