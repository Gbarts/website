package org.zerock.dto;

public class MemberDTO {

	private String id;
	private	String pw;
	private String name;
	private String email;
	
	public String getUserid() {
		return id;
	}
	public String getPasswd() {
		return pw;
	}
	public void setuserid() {
		this.id = id;
	}
	public void setuserpw() {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public String geteamil() {
		return email;
	}
	public void setName() {
		this.name = name;
	}
	public void setEmail() {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email" + email + "]";
	}
	
	
}
