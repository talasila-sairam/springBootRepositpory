package com.sb.app.dto;

public class UserDto {
	private int user_id;
	private String user_fname;
	private String user_lname;
    private String gender;
	private String state;
	private String zip;
	private String mobile;
	private String email;
	private String password;
	private int active_status;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive_status() {
		return active_status;
	}
	public void setActive_status(int active_status) {
		this.active_status = active_status;
	}
	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname + ", gender="
				+ gender + ", state=" + state + ", zip=" + zip + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", active_status=" + active_status + "]";
	}
	
}
