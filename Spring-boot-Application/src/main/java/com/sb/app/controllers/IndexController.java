package com.sb.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sb.app.dto.UserDto;
import com.sb.app.service.UserService;

@Controller
public class IndexController {
	@Autowired
	UserService service;
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
    	System.out.println("ddddddddddddddddddddddddddddd");
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }
     
    @RequestMapping("/next.htm")
    public String next(Map<String, Object> model) {
    	System.out.println("nexttttttttttttttttttttttttttttttttttt");
    	System.out.println(service.fetchUser());
    	UserDto dto=new UserDto();
    	dto.setActive_status(1);
    	dto.setEmail("akl@gmail.com");
    	dto.setGender("male");
    	dto.setMobile("8997654312");
    	dto.setState("Odisha");
    	dto.setUser_fname("Rahul");
    	dto.setUser_lname("Sen");
    	dto.setZip("897654");
    	//System.out.println(service.savedata(dto));
        model.put("message", "You are in new page !!");
        return "next";
    }
 
}