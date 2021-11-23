
package com.moqtar.transport.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public ModelAndView hello() {

		String helloWorldMessage = "<B>Hello world from java2blog!</B>";
		return new ModelAndView("hello", "message", helloWorldMessage);

	}

	@RequestMapping("/index")
	public ModelAndView index() {

		return new ModelAndView("index");

	}

}
