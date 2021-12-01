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
import com.moqtar.transport.dao.entity.Commodity;
import com.moqtar.transport.dao.entity.UserDetailes;
import com.moqtar.transport.model.CommodityBean;

public class CommodityController {
	
	@Autowired
	private CommodityRepo commodityRepo;
	
	@RequestMapping(params= "commodity",value = "/login", method = RequestMethod.POST)
	public ModelAndView init(Model model) {
			model.addAttribute("msg", "Please Enter Your Commodity Details");
		model.addAttribute("commodityBean", new CommodityBean());
		return new ModelAndView("commodity");
	}

	@RequestMapping(value = "/commodity", method = RequestMethod.POST)

	public ModelAndView save(@ModelAttribute("commodityBean") CommodityBean commodityBean, BindingResult result,
			ModelMap model) {
				System.out.println(commodityBean.toString());
	          	Commodity commodity = new Commodity(commodityBean.getCommodityDetailes(),commodityBean.getCarName(), commodityBean.getRegistrationNumber(),
	          			commodityBean.getSourceAdd(), commodityBean.getDestinationAdd());
		commodityRepo.insert(commodity);
		model.addAttribute("msg", commodityBean.getCommodityDetailes());
		return new ModelAndView("commodity");

	}

}
