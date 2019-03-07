package ch.jfriedli.springdemo.springdemoannotation;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
