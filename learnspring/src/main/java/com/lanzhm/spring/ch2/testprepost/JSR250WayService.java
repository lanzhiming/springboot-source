package com.lanzhm.spring.ch2.testprepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	@PostConstruct
	public void init(){
		System.out.println("@JSR250-init-method");
	}
	
	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@JSR250-destroy-method");
	}
}
