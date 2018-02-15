package com.springboot.fist.app;

public class RemoveingTrailingZeros {
  public static void main(String[] args) {
	System.out.println("main method");
	String str = "01046466006600";
	for(int i=0;i<str.length(); i++) {
			if(str.charAt(0) == str.charAt(1)) {
				str = str.substring(1);
			}else {
				str = str.substring(1);
			     i=str.length();
			  }
	  }
	System.out.println(str);
}
}
