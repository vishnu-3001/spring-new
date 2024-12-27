package com.spring_one.learn_spring_framework_2;

import com.spring_one.learn_spring_framework_2.game.gameRunner;
import com.spring_one.learn_spring_framework_2.game.marioGame;
import com.spring_one.learn_spring_framework_2.game.superContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args){
		var marioGame=new marioGame();
		var superContra=new superContraGame();
//		var gameRunner=new gameRunner(marioGame);
		var gameRunner=new gameRunner(superContra);
		gameRunner.run();

	}

}
