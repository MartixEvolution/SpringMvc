package com.tju.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tju.action.StringAction;
import com.tju.model.User;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String printWelcome(HttpServletRequest request,ModelMap model) {
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		 StringAction myAction=(StringAction)ctx.getBean("lowerAction");
		 System.out.println(myAction.execute("HHHH"));
	     
	    
		model.addAttribute("message", "Spring 3 MVC Hello World");
		ArrayList<User> myList=new ArrayList<User>();
		myList.add(new User("name1", "password1"));
		myList.add(new User("name2", "password2"));
		model.addAttribute("myList",myList);
		return "hello";
	}

	@RequestMapping(value="/helloworld",method = RequestMethod.GET)
	public String printWelcome2(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}
	
	@RequestMapping(value="/helloworld2",method = RequestMethod.GET)
	public String printWelcome3(User myUser,ModelMap model) {
		System.out.println(myUser.toString());
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}
}
