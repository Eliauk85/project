package com.sise.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest{
	public static void main(String[] args)throws Exception{
		// 以类加载路径下的beans.xml文件创建Spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// 判断两次请求singleton作用域的Bean实例是否相等
		System.out.println(ctx.getBean("p1") == ctx.getBean("p1"));
		// 判断两次请求prototype作用域的Bean实例是否相等
		System.out.println(ctx.getBean("p2") == ctx.getBean("p2"));
		System.out.println(ctx.getBean("date"));
		Thread.sleep(1000);
		System.out.println(ctx.getBean("date"));
	}
}
