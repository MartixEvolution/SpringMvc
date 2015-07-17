package com.tju.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView myModelAndView=new ModelAndView();
		myModelAndView.addObject("message","this is my first mvc useage!");
		myModelAndView.setViewName("hello");
		return myModelAndView;
	}
}
