package com.sys.main.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/test")
	public String test(Model m){
		m.addAttribute("now", DateFormat.getInstance().format(new Date()));
		return "test";
	}
	
	@RequestMapping("/index")
	public String index(Model m){
//		m.addAttribute("now", DateFormat.getInstance().format(new Date()));
		return "index";
	}

}
