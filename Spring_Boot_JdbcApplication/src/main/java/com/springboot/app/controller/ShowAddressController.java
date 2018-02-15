package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.app.dto.UserAddressDTO;
import com.springboot.app.service.UserAddressService;

@Controller
public class ShowAddressController {
	
	@Autowired(required=true)
	UserAddressService userAddressService;
	
  public ShowAddressController() {
	  System.out.println("inside ShowAddressController class constructor");
  }
  
  @RequestMapping("/display-address.htm")
  public String getAddressDetails(Model model ,@RequestParam("zipcode") String zipcode) {
	  System.out.println("inside getAddressDetails method");
	  if(zipcode == null || zipcode == "" || zipcode.length()<6) {
		  System.out.println("inside else block");
		  model.addAttribute("errorValue","Please enter Valid ZipCode"); 
	  }else {
		  System.out.println("inside if block");
		  int zip = Integer.parseInt(zipcode);
		  List<UserAddressDTO> userAddressDTO = userAddressService.getUserAddress(zip);
		  model.addAttribute("listAddress",userAddressDTO);
	  }
	  return "display-address";
  }
}
