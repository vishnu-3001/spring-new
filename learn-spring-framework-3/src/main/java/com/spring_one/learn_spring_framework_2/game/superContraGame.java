package com.spring_one.learn_spring_framework_2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class superContraGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("sit down");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("shoot a bullet");
	}

}
