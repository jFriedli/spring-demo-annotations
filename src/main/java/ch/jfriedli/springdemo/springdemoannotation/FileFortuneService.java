package ch.jfriedli.springdemo.springdemoannotation;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Value("${fortune.a}")
	private String fortune;
	
	@Override
	public String getFortune() {
		return fortune;
	}

}
