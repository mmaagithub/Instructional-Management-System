package com.dao;

import java.util.List;

public interface Dao {
	//��ѯȫ��
	List selectAll();
	//ɾ��
	int delete(int id);
	//�޸�
	int update(Object...obj);
	//����
	int add(Object obj);
}
