package com.dao;

import java.util.List;

import com.role.Page;

public interface Fy {
	//�����Page���Ե�ֵ
		Page page();
		//���շ�ҳ��ѯȫ��
		List selectAll(int offsetone,int slide);
}
