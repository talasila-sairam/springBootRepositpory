package com.springboot.fist.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
  public TestController() {
     System.out.println("inside TestController constructor");	  
  }
  
  @RequestMapping("/")
  public String viewIndexPage(Model model) {
	  System.out.println("inside viewIndexPage method");
	  model.addAttribute("message","This is index page");
	  return "index";
  }
  
  @RequestMapping("/next.htm")
  public String viewNextPage(Model model) {
	  System.out.println("inside viewNextPage method");
	  model.addAttribute("message","This is next page");
	  return "next";
  }
}
