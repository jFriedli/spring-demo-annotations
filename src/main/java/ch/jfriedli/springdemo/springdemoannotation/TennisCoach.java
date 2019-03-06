package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.stereotype.Component;

//default bean ID is the class name starting with lower case
//tennisCoach
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

}
