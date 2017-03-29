package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/escritorio")
	public String escritorio(Model model){
		System.out.println("Escritorio");
		return "escritorio";
	}
	
	@RequestMapping(value = "/portatil")
	public String portatil(Model model){
		System.out.println("Portatil");
		return "portatil";
	}

}
