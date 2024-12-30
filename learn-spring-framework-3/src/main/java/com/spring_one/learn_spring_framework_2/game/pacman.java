package com.spring_one.learn_spring_framework_2.game;

import org.springframework.stereotype.Component;

@Component
public class pacman implements GamingConsole {
	public void up() {
		System.out.println("Pacman up");
	}
	public void down() {
		System.out.println("Pacman down");
	}
	public void left() {
		System.out.println("Pacman left");
	}
	public void right() {
		System.out.println("Pacman right");
	}

}
