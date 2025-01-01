package com.spring_one.learn_spring_framework_2.examples.e0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.spring_one.learn_spring_framework_2.game.gameRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{
	
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class prototypeClass{
	
}


@Configuration
@ComponentScan
public class BeanScopeInitializationLauncherApplication {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(BeanScopeInitializationLauncherApplication.class)){
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			System.out.println(context.getBean(prototypeClass.class));
			System.out.println(context.getBean(prototypeClass.class));
			System.out.println(context.getBean(prototypeClass.class));

			}
		
	}

}
//bean,component,autowired,scope,qualifier,inject,named
