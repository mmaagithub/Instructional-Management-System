package com.service.impl;

import java.util.List;

import com.dao.iml.TeacherDaoImpl;
import com.service.Service;

public class TeacherServiceImpl implements Service {
	TeacherDaoImpl tea = new TeacherDaoImpl();
	@Override
	public List SelectAll() {
		List list = tea.selectAll();
		if(list.size()>0)
			return list;
		else
			return list;
	}

	@Override
	public int Delete(int id) {	
		return tea.delete(id);
	}

	@Override
	public int Update(Object... obj) {
		return tea.update(obj);
	}

	@Override
	public int Add(Object obj) {
		return tea.add(obj);
	}

	@Override
	public int StudentAddUser(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
