package com.spring_one.learn_spring_framework_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person(String name,int age,Address address) {};
record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "vishnu";
	}
	@Bean
	public int age() {
		return 24;
	}
	@Bean
	public Person person() {
		return new Person("vishnu",24,new Address("luxettipet","India"));
	}
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean
	@Qualifier("person3Qualifier")
	public Person person3Parameters(String name,int age, Address address) {
		return new Person(name,age,address);
	}
	@Bean
	public Address address() {
		return new Address("700 health","StonyBrook");
	}
}
