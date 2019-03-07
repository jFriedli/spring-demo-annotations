package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Train ball control";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: FortuneServiceSetter called");
		this.fortuneService = fortuneService;
	}

}
