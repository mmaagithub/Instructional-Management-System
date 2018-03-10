package com.dao.iml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dao.Dao;
import com.database.DataBase;
import com.role.Student;

public class ScoreDaoImpl implements Dao{
	List list = null;
	DataBase db = new DataBase();
	//查看学生的所有成绩
	@Override
	public List selectAll() {
		list = new ArrayList();
		String sql = "select stu.stu_id,stu.stu_name,stu.stu_class,le.*,sco.score from student as stu INNER JOIN score as sco ON stu.stu_id=sco.user_id INNER JOIN lesson as le on sco.lesson_id=le.lesson_id";
		ResultSet res = db.sel(sql);
		try {
			while (res.next()) {
				int stu_id = res.getInt(1);
				String stu_name = res.getString(2);
				String stu_class = res.getString(3);
				int lesson_id = res.getInt(4);
				String lesson_name = res.getString(5);
				int teach_id = res.getInt(6);
				String tesch_name = res.getString(7);
				int score = res.getInt(8);
				List smallList = new ArrayList();
				smallList.add(stu_id);
				smallList.add(stu_name);
				smallList.add(stu_class);
				smallList.add(lesson_id);
				smallList.add(lesson_name);
				smallList.add(teach_id);
				smallList.add(tesch_name);
				smallList.add(score);
				list.add(smallList);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public int delete(int id) {
		
		return 0;
	}

	@Override
	public int update(Object... obj) {
		
		return 0;
	}

	@Override
	public int add(Object obj) {
		
		return 0;
	}

}
