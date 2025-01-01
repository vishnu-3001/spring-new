package com.spring_one.learn_spring_framework_2.examples.d0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.spring_one.learn_spring_framework_2.game.gameRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA=classA;
	}
	public void test() {
		System.out.println("Bean launched succesfully");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			System.out.println("Context initialized succesfully");
			context.getBean(ClassB.class).test();
			}
		
	}

}
