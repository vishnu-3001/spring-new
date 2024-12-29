package com.spring_one.learn_spring_framework_2;

import com.spring_one.learn_spring_framework_2.game.gameRunner;
import com.spring_one.learn_spring_framework_2.game.marioGame;
import com.spring_one.learn_spring_framework_2.game.pacman;
import com.spring_one.learn_spring_framework_2.game.superContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args){
		var marioGame=new marioGame();
		var superContra=new superContraGame();
		var pacman=new pacman();
		var gameRunner=new gameRunner(marioGame);
		var gameRunner2=new gameRunner(superContra);
		var gameRunner3=new gameRunner(pacman);
		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();

	}

}
