package com.seanco.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("randomFortuneService")
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Fortune 1",
			"Fortune 2",
			"Fortune 3"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return data[random.nextInt(data.length)];
	}

}
