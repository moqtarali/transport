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

import com.moqtar.transport.dao.CommodityRepo;
import com.moqtar.transport.dao.entity.Commodity;
import com.moqtar.transport.model.CommodityBean;
@Controller
public class CommodityController {
	
	@Autowired
	private CommodityRepo commodityRepo;
	
	@RequestMapping(params= "AddCommodity",value = "/showCommodity", method = RequestMethod.POST)
	public ModelAndView init(Model model) {
			model.addAttribute("msg", "Please Enter Your Commodity Details");
		model.addAttribute("commodityBean", new CommodityBean());
		return new ModelAndView("commodity");
	}

	@RequestMapping(value = "/savecommodity", method = RequestMethod.POST)

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
