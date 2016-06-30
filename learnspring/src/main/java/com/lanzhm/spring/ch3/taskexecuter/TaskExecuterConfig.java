package com.lanzhm.spring.ch3.taskexecuter;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.aop.interceptor.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.lanzhm.spring.ch3.taskexecuter")
@EnableAsync
public class TaskExecuterConfig implements AsyncConfigurer {

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
		return null;
	}

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

}
