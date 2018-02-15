package com.springboot.app.dto;

public class UserAddressDTO {
   public UserAddressDTO() {
	   System.out.println("UserAddressDTO class constructor");
   }
   private String name;
   private String hNo;
   private int pincode;
   private String address;
   private String mobileNo;
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
