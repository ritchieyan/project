package com.wyrz.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author yanziqi
 * @date 2014年12月10日下午5:31:54
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		System.out.println("aaaa");
		return "index";
	}
}
