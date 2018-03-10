package com.role;

public class Student {
	private String id = null ;
	private String name = null;
	private String age = null;
	private String sex = null;
	private String password = null;
	private String tel = null;
	private String stu_class = null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public Student(String id, String password,String name, String age, String sex,
			 String tel, String stu_class) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.password = password;
		this.tel = tel;
		this.stu_class = stu_class;
	}
	public Student(String id,String name, String age, String sex,
			 String tel, String stu_class) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
		this.stu_class = stu_class;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}