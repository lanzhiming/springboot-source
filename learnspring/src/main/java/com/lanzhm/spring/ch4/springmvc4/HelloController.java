package com.lanzhm.spring.ch4.springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
