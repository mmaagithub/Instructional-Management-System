package com.service.impl;

import java.util.List;

import com.dao.Dao;
import com.dao.iml.StudentDaoImpl;
import com.role.Student;
import com.service.Service;

public class StudentServiceImpl implements Service {
	StudentDaoImpl stu = new StudentDaoImpl();
	//查询全部
	@Override
	public List<Student> SelectAll() {		
		List list = stu.selectAll();
		if(list.size()>0){
			return list;
		}else{
			return list;
		}		
	}
	//删除
	@Override
	public int Delete(int id) {
		 return stu.delete(id);
	}
	//修改student表的
	@Override
	public int Update(Object... obj) {		
		return stu.update(obj);
	}
	//增加学生
	@Override
	public int Add(Object obj) {
		return stu.add(obj);
	}
	//在user里增加相应的信息
	public int StudentAddUser(Object obj) {
		return stu.addUser(obj);
	}
	
	
}
