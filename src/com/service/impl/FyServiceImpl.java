package com.service.impl;

import java.util.List;

import com.dao.Fy;
import com.dao.iml.FyImpl;
import com.role.Page;
import com.service.FyService;

public class FyServiceImpl implements FyService {
	Fy f = new FyImpl();
	@Override
	public Page page() {
		return f.page();
	}

	@Override
	public List selectAll(int offsetone, int slide) {
		return f.selectAll(offsetone, slide);
	}

}
