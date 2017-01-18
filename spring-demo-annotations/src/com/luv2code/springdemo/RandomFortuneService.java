package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = {"beware of the wolf ",
			"diligence is the mother of good luck",
			"The journey is the reward"};
	
	private Random myRandom = new Random();
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		
	int index = myRandom.nextInt(data.length);
	
	String theFortune = data[index];
		
		return theFortune;
	}

}
