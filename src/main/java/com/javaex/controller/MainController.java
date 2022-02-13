package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jblog")
public class MainController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("jblog/main");
		
		return "blog/blog-main";
	}

}
