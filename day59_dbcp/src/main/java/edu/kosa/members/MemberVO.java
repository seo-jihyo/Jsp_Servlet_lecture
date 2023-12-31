package edu.kosa.members;

import java.sql.Timestamp;

public class MemberVO {
	//멤버변수
	private String id, passwd, name, jumin1, jumin2, email, blog;
	private Timestamp reg_date;
	
	//useBean 태그 이용해서 객체 생성
	public MemberVO() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin1() {
		return jumin1;
	}
	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}
	public String getJumin2() {
		return jumin2;
	}
	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	/*
	 * public String getDate() { return date; } public void setDate(String date) {
	 * this.date = date; }
	 */

	public Timestamp getReg_date() {
		return reg_date;
	}
	
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", jumin1=" + jumin1 + ", jumin2="
				+ jumin2 + ", email=" + email + ", blog=" + blog + ", reg_date=" + reg_date + "]";
	}
}
