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

import com.moqtar.transport.dao.UserLoginRepo;
import com.moqtar.transport.dao.entity.UserLogin;
import com.moqtar.transport.model.LoginBean;

@Controller
public class LoginController {
	@Autowired
	private UserLoginRepo userLoginRepo;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView init(Model model) 
	{
		model.addAttribute("msg", "Please Enter Your Login Details");
		model.addAttribute("loginBean", new LoginBean());
		
		System.out.println("yellow");
		return new ModelAndView("login");
		// return "login.jsp";

	}

	
	@RequestMapping(params = "submit",value = "/login",method = RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("loginBean") LoginBean loginBean,BindingResult result, ModelMap model) {
		System.out.println(result.toString());
		System.out.println(loginBean);
		System.out.println(loginBean.getUserName());
		System.out.println(loginBean.getPassword());
		UserLogin userLogin = null;
		if (loginBean != null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			try{
				 userLogin = userLoginRepo.findByUserNameAndPassword(loginBean.getUserName(), loginBean.getPassword());
				}
				catch(Exception e){

				}
			System.out.println(userLogin);
			if (userLogin != null && userLogin.getUserName() != null && userLogin.getPwd() != null ) {
				
				model.addAttribute("msg", loginBean.getUserName());
				
		
				return new ModelAndView("dashboard");
				// return "dashboard.jsp";
			} else {
				model.addAttribute("error", "Invalid Details");
				return new ModelAndView("login");
				// return "login.jsp";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return new ModelAndView("login");
			// return "login.jsp";

		}
	}
}
