package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
