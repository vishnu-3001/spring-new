package com.spring_one.learn_spring_framework_2.game;

public class gameRunner {
//	private marioGame game;
	private superContraGame game;
//	public gameRunner(marioGame game) {
//		this.game=game;
//	}
	public gameRunner(superContraGame game) {
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
