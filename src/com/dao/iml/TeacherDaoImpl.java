package com.dao.iml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.database.DataBase;
import com.role.Student;
import com.role.Teacher;

public class TeacherDaoImpl implements Dao{
	DataBase db = new DataBase();
	List list = null;
	@Override
	public List<Teacher> selectAll() {
		list  = new ArrayList<Teacher>();
		String sql = "select *from teacher";	
		ResultSet res = db.sel(sql);
		try {
			while(res.next()){
				int id = res.getInt(1);
				String password = res.getString(2);
				String name = res.getString(3);
				int age = res.getInt(4);
				String sex = res.getString(5);
				String type = res.getString(6);
				String tel = res.getString(7);
				Teacher tea = new Teacher(id,password,name,age,sex,type,tel);
				list.add(tea);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int delete(int id) {
		String sql = "delete a.*,b.* from user a inner join teacher b on a.user_id = b.tea_id where b.tea_id="+id;
		System.out.println("daoImp²ã");
		int a = db.InsDelUpd(sql);
		return a;		
	}

	@Override
	public int update(Object... obj) {
		int id = Integer.parseInt(((String)obj[0]).trim());
		String password = (String)obj[1];
		String name = (String)obj[2];
		int age = Integer.parseInt(((String)obj[3]).trim());
		String sex = (String)obj[4];
		String type = (String)obj[5];
		String tel = (String)obj[6];		
		String sql = "UPDATE user AS u,teacher AS t SET u.user_password = '"+password.trim()+"', t.tea_password = '"+password.trim()+"',t.tea_name = '"+name.trim()+"',t.tea_age = "+age+",t.tea_sex = '"+sex.trim()+"',t.tea_tel ='"+tel.trim()+"',t.tea_type = '"+type.trim()+"'    "+"where u.user_id = t.tea_id AND tea_id ="+id;	
		int a = db.InsDelUpd(sql);
		return a;
		
	}

	@Override
	public int add(Object obj) {
		Teacher tea = (Teacher)obj;
		int id = tea.getTea_id();
		String password = tea.getTea_password();
		String name = tea.getTea_name();
		int age= tea.getTea_age();
		String  sex=tea.getTea_sex();
		String  type= tea.getTea_type();	
		String tel = tea.getTea_tel();
		String sql = "insert into teacher values("+id+",'"+password+"','"+name+"',"+age+",'"+sex+"','"+type+"','"+tel+"');insert into user values("+id+",'"+password+"','teacher')";
		int a = db.InsDelUpd(sql);
		return a;		
	}

}
