package com.moqtar.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moqtar.transport.dao.PasswordRepo;
import com.moqtar.transport.dao.UserLoginRepo;
import com.moqtar.transport.dao.entity.Password;
import com.moqtar.transport.model.PasswordBean;

@Controller
public class ForgotPasswordController {
	
	@Autowired
	private PasswordRepo passwordRepo;
	
	@Autowired
	private UserLoginRepo userLoginRepo;
	
	
	
	@RequestMapping(params= "newPassword",value = "/login", method = RequestMethod.POST)
	public ModelAndView init(Model model) {
		model.addAttribute("msg", "Please Enter Your forgotpassword Details");
		model.addAttribute("passwordBean", new PasswordBean());
		return new ModelAndView("forgotpassword");
			
	}
	@RequestMapping(value = "/savepassword", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("passwordBean") PasswordBean passwordBean, BindingResult result,
			ModelMap model) {
		System.out.println(passwordBean.toString());
		Password password = new Password(passwordBean.getOldPassword(), passwordBean.getNewPassword(), passwordBean.getConformPassword());
		passwordRepo.insert(password);
		model.addAttribute("msg", passwordBean.getConformPassword());
		return new ModelAndView("forgotpassword");
		
	}
}
