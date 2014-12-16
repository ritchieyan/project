package com.wyrz.shop.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wyrz.shop.service.GuaranteeService;

/**
 * 
 * @author yanziqi
 * @date 2014年12月10日下午5:31:54
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
	@Resource(name = "guaranteeAnnotationService")
	private GuaranteeService guaranteeAnnotationService;
	@Resource(name = "guaranteeXmlService")
	private GuaranteeService guaranteeXmlService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		// 注解方式
		// List<Guarantee> guarantees = guaranteeAnnotationService.queryAll();
		// Guarantee guarantee = guaranteeAnnotationService.queryById(1);
		// Xml方式
		// List<Guarantee> guarantees = guaranteeXmlService.queryAll();
		// Guarantee guarantee = guaranteeXmlService.queryById(1);
		// System.out.println(guarantees);
		// System.out.println(guarantee);
		return "index";
	}
}
