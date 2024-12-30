package com.spring_one.learn_spring_framework_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring_one.learn_spring_framework_2.game.GamingConsole;
import com.spring_one.learn_spring_framework_2.game.pacman;
import com.spring_one.learn_spring_framework_2.game.*;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game=new pacman();
		return game;
	}
	@Bean
	public gameRunner gameRunner() {
		var gameRunner = new gameRunner(game());
		return gameRunner;
	} 

}
