package com.service;

import java.util.List;

import com.role.Student;

public interface Service {
	//�鿴ȫ��ѧ������Ϣ
	List SelectAll();
	//ɾ������ѧ��
	int Delete(int id);
	//�޸ĵ���ѧ���Ķ����Ϣ
	int Update(Object...obj);
	//���ӵ���ѧ��
	int Add(Object obj);
	//��user��������Ӧ����Ϣ
	int StudentAddUser(Object obj);
}
