package com.dao.iml;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.database.DataBase;
import com.role.Student;

public class BeginLogin {
	List list = null;
	DataBase db = new DataBase();
	
	public Object begin_login(String id,String password,String role) {
		String sql = "select * from user";
		 ResultSet res = db.login(sql);		
			try {
				while(res.next()){
					if (res.getString("user_id").equals(id)&& res.getString("user_password").equals(password)) {
																
					} 
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
}
