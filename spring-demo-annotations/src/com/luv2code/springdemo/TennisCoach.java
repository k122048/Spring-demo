package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Tennis Coach : inside Constructor");
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice 5 times a day";
	}
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("Tenniscoach>> inside my do my startup Stuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff()
	{
		
		System.out.println("Tennis coach >> inside do my cleanup Stuff");
	}
	
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getDailyFortune();
	}
	
	

}
