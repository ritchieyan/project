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
		// List<Guarantee> guarantees = guaranteeAnnotationService.queryAll();
		// GuaranteeQuery query = new GuaranteeQuery();
		// query.setGuaranteeId(1);
		// query.setGuaranteeName("ccc");
		// Pageable pageable = new PageRequest(1, 2);
		// List<Guarantee> guarantees = guaranteeAnnotationService.queryList(query, pageable);
		// List<Integer> idList = guaranteeAnnotationService.queryAllId();
		// List<Guarantee> guarantees = guaranteeAnnotationService.queryByIdList(idList);
		// List<Integer> idList = guaranteeAnnotationService.queryIdList(query);
		// List<Guarantee> guarantees = guaranteeAnnotationService.queryList(query);
		// Guarantee guarantee = guaranteeAnnotationService.queryOne(query);
		// Guarantee guarantee = guaranteeAnnotationService.queryById(1);
		// Long count = guaranteeAnnotationService.queryCount(query);
		// Guarantee guarantee = new Guarantee();
		// guarantee.setGuaranteeName("yanziqi");
		// guarantee.setGuaranteeTel("123455");
		// guaranteeAnnotationService.insert(guarantee);
		//
		// List<Guarantee> guaranteeList = new ArrayList<Guarantee>();
		// guaranteeList.add(guarantee);
		// guaranteeList.add(guarantee);
		// guaranteeAnnotationService.insertInBatch(guaranteeList);
		// guarantee.setGuaranteeName("ritchieyan");
		// guaranteeAnnotationService.updateById(guarantee);
		// guaranteeAnnotationService.deleteById(10);
		// guaranteeAnnotationService.delete(guarantee);
		// System.out.println(count);
		// System.out.println(idList);
		// System.out.println(guarantees);
		// System.out.println(guarantee);
		return "index";
	}
}
