package com.lanzhm.spring.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		String cmd = listService.showListCmd();
		System.out.println(context.getEnvironment().getProperty("os.name")+" 系统下的列表命令为："+cmd);
		context.close();
	}

}
