package com.lanzhm.spring.ch1.testaop1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lanzhm.spring.ch1.testaop1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
