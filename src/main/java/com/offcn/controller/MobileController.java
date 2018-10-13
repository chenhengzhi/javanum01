package com.offcn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.po.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	private MobileService mobileService;
	
	//白洁
	@RequestMapping("/find")
	public String find(String number,Model model){
		String string = number.substring(0, 7);
		Mobile mobile=mobileService.getArea(string);
		System.out.println(number);
		String str = mobile.getMobileArea();
		String str2 = str+mobile.getMobileType();
		
		
		model.addAttribute("msg", str2);
		System.out.println("OK"+"--陈恒志");
		return "mobile";
	}

}
