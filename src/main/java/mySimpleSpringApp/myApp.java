package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Meal;

public class myApp {

	public static void main(String[] args) {
	

		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
	
		Meal myNormalMeal = new Meal();
		System.out.println("Normal meal: " + myNormalMeal.whatIsInThisMeal());
		
		Meal myspringMeal = appContext.getBean("meal",Meal.class);
		System.out.println("spring meal: " + myspringMeal.whatIsInThisMeal());
	}

}
