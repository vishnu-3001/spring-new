package com.spring_one.learn_spring_framework_2.game;

public class marioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go into a hole");
	}
	public void left() {
		System.out.println("Go left");
	}
	public void right() {
		System.out.println("Go right");
	}
}
