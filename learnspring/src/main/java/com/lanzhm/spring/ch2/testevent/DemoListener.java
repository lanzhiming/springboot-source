package com.lanzhm.spring.ch2.testevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		String msg=event.getMsg();
		System.out.println("我(bean-demoListener)收到了"
				+ "(bean-demoPublisher) 发布的消息:"+msg);
	}

}
