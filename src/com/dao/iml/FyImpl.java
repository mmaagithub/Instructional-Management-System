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
	// 可以查到总条数，根据总条数和每页显示计算出总页数（总条数+每页显示数-1）/每页显示数
	public Page page() {
		Page p = null;
		// 查询总条数
		String sql = "select COUNT(*) from student";
		ResultSet res = db.sel(sql);
		// 定义总页数
		int pc = 0;
		// 定义总条数
		int z = 0;
		try {
			while (res.next()) {
				p = new Page();
				z = res.getInt(1);
				p.setCount(z);
			}
			// 计算出总页数
			pc = (z + p.getSlide() - 1) / p.getSlide();
			p.setPageCount(pc);
			/*
			 * //判断如果有余数，那么总页数＋1 if(z%p.getSlide()==0){ pc =z/p.getSlide();
			 * }else{ pc =z/p.getSlide()+1; }
			 */

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	@Override
	//得到每页要显示的数据
	public List selectAll(int offsetone, int slide) {
		List list = new ArrayList();
		Student stu = null;
		/*	//select字段列表		from数据源	limit [start,]length;
		start表示从第几行记录开始检索，length表示检索多少行记录。表中第一行记录的start值为0*/
		//查询某几行记录
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
				//通过有参的构造方法创建Student对象
				stu = new Student(stuId,stuName,stuAge,stuSex,stuTel,stuClass);
				//把Student对象增加到list集合
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
