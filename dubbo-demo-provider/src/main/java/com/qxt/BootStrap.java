package com.qxt;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

	public static void main(String[] args) throws IOException {
		//加载上下文文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		//加载服务到容器
		context.start();
		//一个阻塞
		System.in.read();
	}
}
