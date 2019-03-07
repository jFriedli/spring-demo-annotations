package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//default bean ID is the class name starting with lower case
//tennisCoach
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
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
	@Qualifier("randomFortuneService")
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach: Do crazy stuff!");
	}

}
