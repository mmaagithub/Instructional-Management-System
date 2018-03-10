package com.service.impl;

import java.util.List;

import com.dao.Dao;
import com.dao.iml.StudentDaoImpl;
import com.role.Student;
import com.service.Service;

public class StudentServiceImpl implements Service {
	StudentDaoImpl stu = new StudentDaoImpl();
	//��ѯȫ��
	@Override
	public List<Student> SelectAll() {		
		List list = stu.selectAll();
		if(list.size()>0){
			return list;
		}else{
			return list;
		}		
	}
	//ɾ��
	@Override
	public int Delete(int id) {
		 return stu.delete(id);
	}
	//�޸�student���
	@Override
	public int Update(Object... obj) {		
		return stu.update(obj);
	}
	//����ѧ��
	@Override
	public int Add(Object obj) {
		return stu.add(obj);
	}
	//��user��������Ӧ����Ϣ
	public int StudentAddUser(Object obj) {
		return stu.addUser(obj);
	}
	
	
}
