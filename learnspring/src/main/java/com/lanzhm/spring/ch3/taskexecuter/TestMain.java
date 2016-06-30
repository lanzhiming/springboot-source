package com.lanzhm.spring.ch3.taskexecuter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecuterConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		
		context.close();
	}

}
