package com.service.impl;

import java.util.List;

import com.dao.iml.ScoreDaoImpl;
import com.service.Service;

public class ScoreServiceImpl implements Service{
	ScoreDaoImpl score = new ScoreDaoImpl();
	@Override
	public List<List> SelectAll() {
		List list = score.selectAll();
		if(list.size()>0){
			return list;
		}else{
			return list;
		}		
	}

	@Override
	public int Delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(Object... obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Add(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int StudentAddUser(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
