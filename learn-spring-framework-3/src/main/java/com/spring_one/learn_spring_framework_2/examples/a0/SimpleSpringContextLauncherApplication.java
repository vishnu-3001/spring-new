package com.spring_one.learn_spring_framework_2.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.spring_one.learn_spring_framework_2.game.gameRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
			}
	}

}
