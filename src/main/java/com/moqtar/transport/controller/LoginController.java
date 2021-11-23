
package com.moqtar.transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moqtar.transport.model.LoginBean;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView init(Model model) 
	{
		model.addAttribute("msg", "Please Enter Your Login Details");
		System.out.println("yellow");
		return new ModelAndView("login");
		// return "login.jsp";

	}

	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("loginBean") LoginBean loginBean,BindingResult result, ModelMap model) {
		System.out.println(result.toString());
		System.out.println(loginBean);
		System.out.println(loginBean.getUserName());
		System.out.println(loginBean.getPassword());
		if (loginBean != null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			if (loginBean.getUserName().equals("chandra") && loginBean.getPassword().equals("chandra123")) {
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
