package com.service;

import java.util.List;

import com.role.Page;

public interface FyService {
	//�����Page���Ե�ֵ
		Page page();
		//���շ�ҳ��ѯȫ��
		List selectAll(int offsetone,int slide);
}
