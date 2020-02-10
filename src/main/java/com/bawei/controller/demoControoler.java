package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demoControoler {

	@RequestMapping("list")
	public  String list() {
		return "list";
	}
}
