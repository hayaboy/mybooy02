package com.myboot02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String home(){
		System.out.println("nice");
		return "hi2";
	}
	
	
	
	
	@RequestMapping("/kkk.do")
	public String fdsrwefgr(Model model) {
		
		model.addAttribute("futggyygugkh", "hi");
		
		return "hello2";
	}
	
	
	@RequestMapping("/hihi.do")
	public String fsd() {
		return "hello3";
	}
	
	  @RequestMapping("/hello.do")
	  public String hello(Model model){
		System.out.println("fsd");
		model.addAttribute("message","hello.jsp");
		return "hello";
	  } 
	
	  
	  
	
	  
}
