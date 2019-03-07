package ch.jfriedli.springdemo.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (coach.equals(alphaCoach));
		
		System.out.println("It is '" + result + "' that the objects are the same!");
		System.out.println("Memory location for coach: " + coach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		context.close();

	}

}
