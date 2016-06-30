package com.lanzhm.spring.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
//		ScheduledTaskService asyncTaskService = context.getBean(ScheduledTaskService.class);
//		asyncTaskService.reportCurrentTime();
//		asyncTaskService.fixTimeExecution();
		
		context.close();
	}

}
