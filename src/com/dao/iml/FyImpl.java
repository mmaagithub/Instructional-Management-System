package com.dao.iml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Fy;
import com.database.DataBase;
import com.role.Page;
import com.role.Student;

public class FyImpl implements Fy {
	DataBase db = new DataBase();

	@Override
	// ���Բ鵽��������������������ÿҳ��ʾ�������ҳ����������+ÿҳ��ʾ��-1��/ÿҳ��ʾ��
	public Page page() {
		Page p = null;
		// ��ѯ������
		String sql = "select COUNT(*) from student";
		ResultSet res = db.sel(sql);
		// ������ҳ��
		int pc = 0;
		// ����������
		int z = 0;
		try {
			while (res.next()) {
				p = new Page();
				z = res.getInt(1);
				p.setCount(z);
			}
			// �������ҳ��
			pc = (z + p.getSlide() - 1) / p.getSlide();
			p.setPageCount(pc);
			/*
			 * //�ж��������������ô��ҳ����1 if(z%p.getSlide()==0){ pc =z/p.getSlide();
			 * }else{ pc =z/p.getSlide()+1; }
			 */

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	@Override
	//�õ�ÿҳҪ��ʾ������
	public List selectAll(int offsetone, int slide) {
		List list = new ArrayList();
		Student stu = null;
		/*	//select�ֶ��б�		from����Դ	limit [start,]length;
		start��ʾ�ӵڼ��м�¼��ʼ������length��ʾ���������м�¼�����е�һ�м�¼��startֵΪ0*/
		//��ѯĳ���м�¼
		String sql = "select * from student limit " + offsetone + "," + slide
				+ "";
		ResultSet res = db.sel(sql);
		try {
			while (res.next()) {
				String stuId = String.valueOf(res.getInt(1));
				String stuName = res.getString(3);
				String  stuAge = res.getString(4);
				String stuSex = res.getString(5);
				String stuTel = res.getString(6);
				String stuClass = res.getString(7);				
				//ͨ���вεĹ��췽������Student����
				stu = new Student(stuId,stuName,stuAge,stuSex,stuTel,stuClass);
				//��Student�������ӵ�list����
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
