package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//default bean ID is the class name starting with lower case
//tennisCoach
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	@Qualifier("happyFortuneService")
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach: Do crazy stuff!");
	}

}
