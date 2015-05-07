package com.zhangk.mybatis.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class Test {

	public static void main(String[] args) {
		Waiter target = new NaiveWaiter();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(target);
		factory.addAspect(PreGreetingAspect.class);
		Waiter proxy = factory.getProxy();
		proxy.greetTo("John");
		System.out.println("--------------");
		proxy.serveTo("John");
	}

}
