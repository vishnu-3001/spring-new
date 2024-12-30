package com.spring_one.learn_spring_framework_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_one.learn_spring_framework_2.game.GamingConsole;
import com.spring_one.learn_spring_framework_2.game.gameRunner;
//import com.spring_one.learn_spring_framework_2.helloworld.HelloWorldConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context=new AnnotationConfigApplicationContext(GamingConfiguration.class)){
//			((GamingConsole)context.getBean("game")).up();
			((gameRunner)context.getBean("gameRunner")).run();
			}
	}

}
