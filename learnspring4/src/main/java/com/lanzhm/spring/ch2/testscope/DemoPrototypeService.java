package com.lanzhm.spring.ch2.testscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")//每次访问生产一个新的实例
public class DemoPrototypeService {

}
