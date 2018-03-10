package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://127.0.0.1:3306/xscjgl2?useUnicode=true&characterEncoding=utf8";
	static String user = "root";
	static String password = "root";
	static String maxsql = null;
	static Connection con = null;
	static int tt ;
	static Statement sta = null;
	static ResultSet res = null;
	//�������ݿ�
	static public Connection lianjie(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return con;		
	}
	//��ɾ��
	public int  InsDelUpd(String sql){
		con = lianjie();
		try {
			sta = con.createStatement();
			tt = sta.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return tt;		
	}
	//��ѯ
	public ResultSet sel(String sql){
		con = lianjie();
		try {
			sta = con.createStatement();
			res = sta.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return res;		
	}
	//��ʼ��½
	public ResultSet login(String sql){
		con = lianjie();
		try {
			sta = con.createStatement();
			res = sta.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return res;	
	}
	//�ͷ�
	public void clo(){
		try {
			sta.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}