package ch.jfriedli.springdemo.springdemoannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {"Fortune1", "Fortune2", "Fortune3"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		
		return data [index];
	}

}
