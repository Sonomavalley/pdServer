package com.pd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexCotroller {
//http://www.ajstore.com/index.html
	@RequestMapping("/index.html")
	public ModelAndView showIndex()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
