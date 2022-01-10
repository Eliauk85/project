package com.sise.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest{
	public static void main(String[] args)throws Exception{
		// �������·���µ�beans.xml�ļ�����Spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// �ж���������singleton�������Beanʵ���Ƿ����
		System.out.println(ctx.getBean("p1") == ctx.getBean("p1"));
		// �ж���������prototype�������Beanʵ���Ƿ����
		System.out.println(ctx.getBean("p2") == ctx.getBean("p2"));
		System.out.println(ctx.getBean("date"));
		Thread.sleep(1000);
		System.out.println(ctx.getBean("date"));
	}
}
