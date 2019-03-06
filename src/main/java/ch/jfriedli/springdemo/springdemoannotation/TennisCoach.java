package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

}
