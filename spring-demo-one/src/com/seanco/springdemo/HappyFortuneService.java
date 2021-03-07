package com.seanco.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	private String[] fortunes;
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[rand.nextInt(3)];
	}

	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}
	
}
