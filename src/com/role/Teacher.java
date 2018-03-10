package com.role;

public class Teacher {
	private int tea_id = 0;
	private String tea_password = null;
	private String tea_name = null;
	private int tea_age = 0;
	private String tea_sex = null;
	private String tea_type = null;	
	private String tea_tel = null;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tea_id, String tea_password, String tea_name,
			int tea_age, String tea_sex, String tea_type, String tea_tel) {
		super();
		this.tea_id = tea_id;
		this.tea_password = tea_password;
		this.tea_name = tea_name;
		this.tea_age = tea_age;
		this.tea_sex = tea_sex;
		this.tea_type = tea_type;
		this.tea_tel = tea_tel;
	}
	public int getTea_id() {
		return tea_id;
	}
	public void setTea_id(int tea_id) {
		this.tea_id = tea_id;
	}
	public String getTea_password() {
		return tea_password;
	}
	public void setTea_password(String tea_password) {
		this.tea_password = tea_password;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public int getTea_age() {
		return tea_age;
	}
	public void setTea_age(int tea_age) {
		this.tea_age = tea_age;
	}
	public String getTea_sex() {
		return tea_sex;
	}
	public void setTea_sex(String tea_sex) {
		this.tea_sex = tea_sex;
	}
	public String getTea_type() {
		return tea_type;
	}
	public void setTea_type(String tea_type) {
		this.tea_type = tea_type;
	}
	public String getTea_tel() {
		return tea_tel;
	}
	public void setTea_tel(String tea_tel) {
		this.tea_tel = tea_tel;
	}
	
	
}
