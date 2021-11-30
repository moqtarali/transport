package com.moqtar.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.moqtar.transport.dao.CommodityRepo;
import com.moqtar.transport.dao.UserDetailesRepo;
import com.moqtar.transport.dao.UserLoginRepo;
import com.moqtar.transport.dao.entity.Commodity;
import com.moqtar.transport.dao.entity.UserDetailes;
import com.moqtar.transport.model.CommodityBean;
import com.moqtar.transport.model.SignupBean;

public class CommodityController {
	
	

	@Autowired
	private CommodityRepo commodityRepo;

	@RequestMapping(params= "run",value = "/login", method = RequestMethod.POST)
	public ModelAndView init(Model model) {
			model.addAttribute("msg", "Please Enter Your Commodity Details");
		model.addAttribute("CommodityRepo", new CommodityBean());
		return new ModelAndView("CommodityRepo");
	}

	@RequestMapping(value = "/run", method = RequestMethod.POST)

	public ModelAndView save(@ModelAttribute("CommodityBean") CommodityBean commodityBean, BindingResult result,
			ModelMap model) {
				System.out.println(commodityRepo.toString());
	          	Commodity commodityBean = new Commodity(commodityBean.getCommodityDetailes(),commodityBean.getCarName(), commodityBean.getRegistrationNumber(),
	          			 commodityBean.getSourceAdd(), commodityBean.getDestinationAdd());
	          
		runRepo.insert();
		commodityRepo.insert(commodity);

		model.addAttribute("msg", commodityBean.getSourceAdd());
		model.addAttribute("msg", commodityBean.getDestinationAdd());
		return new ModelAndView("run");

	}

}
