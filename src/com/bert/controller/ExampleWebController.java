package com.bert.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleWebController {
	
	
	
	/**
	 * 跳转到example页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/toExample")
	@ResponseBody
	public ModelAndView toExample(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView("/example");
		return mv;
	}
	
	
	
}