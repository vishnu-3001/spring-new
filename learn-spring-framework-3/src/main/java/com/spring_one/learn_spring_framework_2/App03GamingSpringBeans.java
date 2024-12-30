package com.spring_one.learn_spring_framework_2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring_one.learn_spring_framework_2.game.gameRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring_one.learn_spring_framework_2.game")
public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
			((gameRunner)context.getBean("gameRunner")).run();
			}
	}

}



