package com.seanco.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "I'm so sad fortune service";
	}

}
