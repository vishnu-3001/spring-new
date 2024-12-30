package com.spring_one.learn_spring_framework_2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	private GamingConsole game;
	public gameRunner(@Qualifier("SuperContraGameQualifier")
GamingConsole game) {
		this.game=game;
	}
	public void run() {
		System.out.println("Running game "+game);
		game.down();
		game.up();
		game.left();
		game.right();
	}
}
