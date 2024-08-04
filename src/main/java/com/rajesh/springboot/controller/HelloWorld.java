package com.rajesh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorld {
	@GetMapping("/hello")
	public String hello(Model model) {
     model.addAttribute("message","Hello World");
	return "helloworld"	;
	}
	
	@GetMapping("/style")
	public String style() {
	return "Add-css-js-demo";
	}
	@GetMapping("/Bootstrap")
	public String Bootstrap() {
	return "Add-Bootstrap";
	}
}
