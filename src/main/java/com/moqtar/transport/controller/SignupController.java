package com.moqtar.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.moqtar.transport.dao.UserDetailesRepo;
import com.moqtar.transport.dao.UserLoginRepo;
import com.moqtar.transport.dao.entity.UserDetailes;
import com.moqtar.transport.model.SignupBean;

import com.moqtar.transport.dao.entity.UserDetailes;

@Controller
public class SignupController {
	@Autowired
	private UserDetailesRepo userDetailesRepo;

	@Autowired
	private UserLoginRepo userLoginRepo;

	@RequestMapping(params= "signup",value = "/login", method = RequestMethod.POST)
	public ModelAndView init(Model model) {
	//	SignupBean userForm = new SignupBean();
		model.addAttribute("msg", "Please Enter Your Signup Details");
		model.addAttribute("signupBean", new SignupBean());
		return new ModelAndView("signup");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)

	public ModelAndView save(@ModelAttribute("signupBean") SignupBean signupBean, BindingResult result,
			ModelMap model) {
				System.out.println(signupBean.toString());
		UserDetailes userDetailes = new UserDetailes(signupBean.getFullName(), signupBean.getLastName(),
				signupBean.getUserName(), signupBean.getPassword(), signupBean.getEmail(), signupBean.getDOB(),
				signupBean.getAddress(), signupBean.getMobileNumber());
		userDetailesRepo.insert(userDetailes);
		userLoginRepo.insert(userDetailes);

		model.addAttribute("msg", signupBean.getUserName());
		return new ModelAndView("registerationsucess");

	}

}
