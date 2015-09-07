package com.huarui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("hello springmvc");
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("message", "hello springmvc");
		
		mv.setViewName("success");
		return mv;
	}

}
