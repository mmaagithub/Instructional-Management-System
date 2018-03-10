package com.dao.iml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.database.DataBase;
import com.role.Student;

public class StudentDaoImpl implements Dao{
	List list = null;
	DataBase db = new DataBase();
	//查看所有学生
	@Override
	public List selectAll() {
		list  = new ArrayList<Student>();
		String sql = "select * from student";	
		ResultSet res = db.sel(sql);
		try {
			while(res.next()){
				int id = res.getInt(1);
				String password = res.getString(2);
				String name = res.getString(3);
				String age = res.getString(4);
				String sex = res.getString(5);
				String tel = res.getString(6);
				String stu_class = res.getString(7);
				Student stu = new Student(String.valueOf(id),password,name,age,sex,tel,stu_class);
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//删除
	@Override
	public int delete(int id) {		
		String sql = "delete a.*,b.* from user a inner join student b on a.user_id = b.stu_id where a.user_id="+id;
		System.out.println("daoImp层");
		int a = db.InsDelUpd(sql);
		return a;
	}
	//修改student表
	@Override
	public int update(Object... obj) {
		//UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
		String id = (String)obj[0];
		int idd = Integer.parseInt(id.trim());
		String password = (String)obj[1];
		String name = (String)obj[2];
		String age = (String)obj[3];
		String sex = (String)obj[4];	
		String tel = (String)obj[5];
		String stu_class = (String)obj[6];
		String sql = "UPDATE user AS u,student AS s SET u.user_password = '"+password.trim()+"', s.stu_password = '"+password.trim()+"',s.stu_name = '"+name.trim()+"',s.stu_age = '"+age.trim()+"',s.stu_sex = '"+sex.trim()+"',s.stu_tel ='"+tel.trim()+"',s.stu_class = '"+stu_class.trim()+"'    "+"where u.user_id = s.stu_id AND stu_id ="+idd;	
		int a = db.InsDelUpd(sql);
		return a;
	}
	//增加学生
	public int add(Object obj){	
		Student stu = (Student)obj;
		int id = Integer.valueOf(stu.getId());
		String name = stu.getName();
		String  age= stu.getAge();
		String  sex=stu.getSex();
		String  tel= stu.getTel();
		String  stu_class= stu.getStu_class();	
		String password = stu.getPassword();
		String sql = "insert into student values("+id+",'"+password+"','"+name+"','"+age+"','"+sex+"','"+tel+"','"+stu_class+"')";
		int a = db.InsDelUpd(sql);
		return a;		
	}
	//在user里增加学生信息
	public int addUser(Object obj){
		Student stu = (Student)obj;
		int id = Integer.valueOf(stu.getId());
		String password = stu.getPassword();
		String sql = "insert into user values("+id+",'"+password+"','student')";
		int a = db.InsDelUpd(sql);
		return a;		
	}
}
