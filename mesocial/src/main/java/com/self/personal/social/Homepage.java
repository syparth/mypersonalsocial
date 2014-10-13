package com.self.personal.social;

import org.apache.log4j.Logger;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Homepage {

	Logger log  = Logger.getLogger(Homepage.class);
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage(Model model){
		System.out.println("Home controller is called-1 ");
		return "homePage";
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView showHomePage(){
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		System.out.println("Home controller is called-2");
		return view;
	}
}
